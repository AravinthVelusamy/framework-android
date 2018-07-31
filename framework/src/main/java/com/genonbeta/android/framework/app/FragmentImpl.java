package com.genonbeta.android.framework.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;

import com.genonbeta.android.database.SQLiteDatabase;

/**
 * created by: veli
 * date: 7/31/18 12:56 PM
 */
public interface FragmentImpl
{
	Snackbar createSnackbar(int resId, Object... objects);

	FragmentActivity getActivity();

	Context getContext();
}
