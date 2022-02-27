// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

final class PaperParcelCategory {
  @NonNull
  static final Parcelable.Creator<Category> CREATOR =
      new Parcelable.Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel in) {
          int categoryId = in.readInt();
          int nameResId = in.readInt();
          int colorResId = in.readInt();
          int drawableResId = in.readInt();
          int bgColor = in.readInt();
          Category data = new Category(categoryId, nameResId, colorResId, drawableResId, bgColor);
          return data;
        }

        @Override
        public Category[] newArray(int size) {
          return new Category[size];
        }
      };

  private PaperParcelCategory() {}

  static void writeToParcel(@NonNull Category data, @NonNull Parcel dest, int flags) {
    dest.writeInt(data.getCategoryId());
    dest.writeInt(data.getNameResId());
    dest.writeInt(data.getColorResId());
    dest.writeInt(data.getDrawableResId());
    dest.writeInt(data.getBgColor());
  }
}
