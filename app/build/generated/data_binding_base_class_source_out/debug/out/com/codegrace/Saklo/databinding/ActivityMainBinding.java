// Generated by view binder compiler. Do not edit!
package com.codegrace.Saklo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codegrace.Saklo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnAppoint;

  @NonNull
  public final AppCompatButton btnDrugs;

  @NonNull
  public final AppCompatButton btnHome;

  @NonNull
  public final AppCompatButton btnRemedies;

  @NonNull
  public final AppCompatButton btnSignout;

  @NonNull
  public final Toolbar toolbar;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnAppoint, @NonNull AppCompatButton btnDrugs,
      @NonNull AppCompatButton btnHome, @NonNull AppCompatButton btnRemedies,
      @NonNull AppCompatButton btnSignout, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.btnAppoint = btnAppoint;
    this.btnDrugs = btnDrugs;
    this.btnHome = btnHome;
    this.btnRemedies = btnRemedies;
    this.btnSignout = btnSignout;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAppoint;
      AppCompatButton btnAppoint = ViewBindings.findChildViewById(rootView, id);
      if (btnAppoint == null) {
        break missingId;
      }

      id = R.id.btnDrugs;
      AppCompatButton btnDrugs = ViewBindings.findChildViewById(rootView, id);
      if (btnDrugs == null) {
        break missingId;
      }

      id = R.id.btnHome;
      AppCompatButton btnHome = ViewBindings.findChildViewById(rootView, id);
      if (btnHome == null) {
        break missingId;
      }

      id = R.id.btnRemedies;
      AppCompatButton btnRemedies = ViewBindings.findChildViewById(rootView, id);
      if (btnRemedies == null) {
        break missingId;
      }

      id = R.id.btnSignout;
      AppCompatButton btnSignout = ViewBindings.findChildViewById(rootView, id);
      if (btnSignout == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnAppoint, btnDrugs, btnHome,
          btnRemedies, btnSignout, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
