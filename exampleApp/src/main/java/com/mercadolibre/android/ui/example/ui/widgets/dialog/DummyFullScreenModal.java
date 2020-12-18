package com.mercadolibre.android.ui.example.ui.widgets.dialog;

import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.mercadolibre.android.ui.example.R;
import com.mercadolibre.android.ui.widgets.FullScreenModal;

public class DummyFullScreenModal extends FullScreenModal {
    @Override
    public int getContentView() {
        return R.layout.dummy_fullscreen;
    }

    @Nullable
    @Override
    public String getTitle() {
        return "Modificar envío";
    }

    @Nullable
    @Override
    public String getSecondaryExitString() {
        return "Volver";
    }

    @Nullable
    @Override
    public View.OnClickListener getSecondaryExitClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Volver", Toast.LENGTH_LONG).show();
            }
        };
    }
}
