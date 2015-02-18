package com.olhapromo.highsolution.Adaptador;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.text.NumberFormat;

/**
 * Created by Pedro on 18/02/2015.
 * Classe para converter o valor inserido em valor monetario
 */
public class MascaraMonetaria implements TextWatcher {



        private boolean isUpdating;
        private EditText mEditText;
        private NumberFormat mNF = NumberFormat.getCurrencyInstance();




    @Override
        public void onTextChanged(CharSequence cs, int start, int before, int after) {
            if (isUpdating) {
                isUpdating = false;
                return;
            }

            isUpdating = true;
            String str = cs.toString();
            boolean hasMask = (str.indexOf("R$") >= 0 && str.indexOf(".") >= 0 && str.indexOf(",") >= 0);

            if (hasMask) {
                str = str.replaceAll("[R$]", "").replaceAll("[.]", "").replaceAll("[,]", "");
            }

            try {
                double value = (Double.parseDouble(str) / 100);
                str = mNF.format(value);
                mEditText.setText(str);
                mEditText.setSelection(str.length());

            } catch (Exception e) {
                e.printStackTrace();
                cs ="Erro";

            }
        }
        public EditText retornaValor(){
            return mEditText;
        }


        @Override
        public void beforeTextChanged(CharSequence cs, int start, int count, int after) {
            // Não iremos utilizar...
        }

        @Override
        public void afterTextChanged(Editable e) {
            // Não iremos utilizar...
        }


}
