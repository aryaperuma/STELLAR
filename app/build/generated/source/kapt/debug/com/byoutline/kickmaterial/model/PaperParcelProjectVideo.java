// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import paperparcel.internal.StaticAdapters;

final class PaperParcelProjectVideo {
  @NonNull
  static final Parcelable.Creator<ProjectVideo> CREATOR =
      new Parcelable.Creator<ProjectVideo>() {
        @Override
        public ProjectVideo createFromParcel(Parcel in) {
          int id = in.readInt();
          String status = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          String high = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          String base = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          String webm = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          int width = in.readInt();
          int height = in.readInt();
          String frame = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          ProjectVideo data = new ProjectVideo(id, status, high, base, webm, width, height, frame);
          return data;
        }

        @Override
        public ProjectVideo[] newArray(int size) {
          return new ProjectVideo[size];
        }
      };

  private PaperParcelProjectVideo() {}

  static void writeToParcel(@NonNull ProjectVideo data, @NonNull Parcel dest, int flags) {
    dest.writeInt(data.getId());
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getStatus(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getHigh(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getBase(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getWebm(), dest, flags);
    dest.writeInt(data.getWidth());
    dest.writeInt(data.getHeight());
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getFrame(), dest, flags);
  }
}
