// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import paperparcel.TypeAdapter;
import paperparcel.internal.ParcelableAdapter;
import paperparcel.internal.StaticAdapters;

final class PaperParcelProjectCreator {
  static final TypeAdapter<ProjectCreatorAvatar> PROJECT_CREATOR_AVATAR_PARCELABLE_ADAPTER =
      new ParcelableAdapter<ProjectCreatorAvatar>(null);

  static final TypeAdapter<CreatorUrls> CREATOR_URLS_PARCELABLE_ADAPTER =
      new ParcelableAdapter<CreatorUrls>(null);

  @NonNull
  static final Parcelable.Creator<ProjectCreator> CREATOR =
      new Parcelable.Creator<ProjectCreator>() {
        @Override
        public ProjectCreator createFromParcel(Parcel in) {
          int id = in.readInt();
          String name = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          ProjectCreatorAvatar avatar =
              PaperParcelProjectCreator.PROJECT_CREATOR_AVATAR_PARCELABLE_ADAPTER.readFromParcel(
                  in);
          CreatorUrls urls =
              PaperParcelProjectCreator.CREATOR_URLS_PARCELABLE_ADAPTER.readFromParcel(in);
          ProjectCreator data = new ProjectCreator(id, name, avatar, urls);
          return data;
        }

        @Override
        public ProjectCreator[] newArray(int size) {
          return new ProjectCreator[size];
        }
      };

  private PaperParcelProjectCreator() {}

  static void writeToParcel(@NonNull ProjectCreator data, @NonNull Parcel dest, int flags) {
    dest.writeInt(data.getId());
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getName(), dest, flags);
    PaperParcelProjectCreator.PROJECT_CREATOR_AVATAR_PARCELABLE_ADAPTER.writeToParcel(
        data.getAvatar(), dest, flags);
    PaperParcelProjectCreator.CREATOR_URLS_PARCELABLE_ADAPTER.writeToParcel(
        data.getUrls(), dest, flags);
  }
}
