// Generated by view binder compiler. Do not edit!
package com.codegrace.Saklo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.codegrace.Saklo.R;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final ConstraintLayout backgroundLayout;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final MotionLayout motionLayout;

  @NonNull
  public final ImageView saklogo;

  @NonNull
  public final MaterialTextView titleTextView;

  private ActivitySplashBinding(@NonNull MotionLayout rootView,
      @NonNull ConstraintLayout backgroundLayout, @NonNull ImageView logo,
      @NonNull MotionLayout motionLayout, @NonNull ImageView saklogo,
      @NonNull MaterialTextView titleTextView) {
    this.rootView = rootView;
    this.backgroundLayout = backgroundLayout;
    this.logo = logo;
    this.motionLayout = motionLayout;
    this.saklogo = saklogo;
    this.titleTextView = titleTextView;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backgroundLayout;
      ConstraintLayout backgroundLayout = ViewBindings.findChildViewById(rootView, id);
      if (backgroundLayout == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      MotionLayout motionLayout = (MotionLayout) rootView;

      id = R.id.saklogo;
      ImageView saklogo = ViewBindings.findChildViewById(rootView, id);
      if (saklogo == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      MaterialTextView titleTextView = ViewBindings.findChildViewById(rootView, id);
      if (titleTextView == null) {
        break missingId;
      }

      return new ActivitySplashBinding((MotionLayout) rootView, backgroundLayout, logo,
          motionLayout, saklogo, titleTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
