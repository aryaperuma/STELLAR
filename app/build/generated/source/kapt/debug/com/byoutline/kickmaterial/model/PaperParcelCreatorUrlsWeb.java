// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import paperparcel.internal.StaticAdapters;

final class PaperParcelCreatorUrlsWeb {
  @NonNull
  static final Parcelable.Creator<CreatorUrlsWeb> CREATOR =
      new Parcelable.Creator<CreatorUrlsWeb>() {
        @Override
        public CreatorUrlsWeb createFromParcel(Parcel in) {
          String user = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          CreatorUrlsWeb data = new CreatorUrlsWeb(user);
          return data;
        }

        @Override
        public CreatorUrlsWeb[] newArray(int size) {
          return new CreatorUrlsWeb[size];
        }
      };

  private PaperParcelCreatorUrlsWeb() {}

  static void writeToParcel(@NonNull CreatorUrlsWeb data, @NonNull Parcel dest, int flags) {
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getUser(), dest, flags);
  }
}
