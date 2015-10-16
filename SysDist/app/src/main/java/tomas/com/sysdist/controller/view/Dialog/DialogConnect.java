package tomas.com.sysdist.controller.view.Dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

import tomas.com.sysdis.R;

/**
 * Created by Tomas on 14/10/2015.
 */
public class DialogConnect extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Information")
                .setIcon(R.drawable.ic_error_black_48dp)
                .setMessage("No hay Internet :(");
        return builder.create();
    }

}
