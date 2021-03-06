// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.byoutline.kickmaterial.model.utils.DateTimeAdapter;
import org.joda.time.DateTime;
import paperparcel.TypeAdapter;
import paperparcel.internal.ParcelableAdapter;
import paperparcel.internal.StaticAdapters;
import paperparcel.internal.Utils;

final class PaperParcelProject {
  static final TypeAdapter<ProjectCreator> PROJECT_CREATOR_PARCELABLE_ADAPTER =
      new ParcelableAdapter<ProjectCreator>(null);

  static final TypeAdapter<ProjectPhoto> PROJECT_PHOTO_PARCELABLE_ADAPTER =
      new ParcelableAdapter<ProjectPhoto>(null);

  static final TypeAdapter<ProjectUrls> PROJECT_URLS_PARCELABLE_ADAPTER =
      new ParcelableAdapter<ProjectUrls>(null);

  @NonNull
  static final Parcelable.Creator<Project> CREATOR =
      new Parcelable.Creator<Project>() {
        @Override
        public Project createFromParcel(Parcel in) {
          int id = in.readInt();
          String projectName = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          String desc = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          float totalAmount = in.readFloat();
          float gatheredAmount = in.readFloat();
          int backers = in.readInt();
          ProjectCreator creator =
              PaperParcelProject.PROJECT_CREATOR_PARCELABLE_ADAPTER.readFromParcel(in);
          ProjectPhoto photo =
              PaperParcelProject.PROJECT_PHOTO_PARCELABLE_ADAPTER.readFromParcel(in);
          String currencySymbol = StaticAdapters.STRING_ADAPTER.readFromParcel(in);
          DateTime launchedAt = Utils.readNullable(in, DateTimeAdapter.INSTANCE);
          DateTime deadline = Utils.readNullable(in, DateTimeAdapter.INSTANCE);
          ProjectUrls urls = PaperParcelProject.PROJECT_URLS_PARCELABLE_ADAPTER.readFromParcel(in);
          Project data = new Project();
          data.setId(id);
          data.setProjectName(projectName);
          data.setDesc(desc);
          data.setTotalAmount(totalAmount);
          data.setGatheredAmount(gatheredAmount);
          data.setBackers(backers);
          data.setCreator(creator);
          data.setPhoto(photo);
          data.setCurrencySymbol(currencySymbol);
          data.setLaunchedAt(launchedAt);
          data.setDeadline(deadline);
          data.setUrls(urls);
          return data;
        }

        @Override
        public Project[] newArray(int size) {
          return new Project[size];
        }
      };

  private PaperParcelProject() {}

  static void writeToParcel(@NonNull Project data, @NonNull Parcel dest, int flags) {
    dest.writeInt(data.getId());
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getProjectName(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getDesc(), dest, flags);
    dest.writeFloat(data.getTotalAmount());
    dest.writeFloat(data.getGatheredAmount());
    dest.writeInt(data.getBackers());
    PaperParcelProject.PROJECT_CREATOR_PARCELABLE_ADAPTER.writeToParcel(
        data.getCreator(), dest, flags);
    PaperParcelProject.PROJECT_PHOTO_PARCELABLE_ADAPTER.writeToParcel(data.getPhoto(), dest, flags);
    StaticAdapters.STRING_ADAPTER.writeToParcel(data.getCurrencySymbol(), dest, flags);
    Utils.writeNullable(data.getLaunchedAt(), dest, flags, DateTimeAdapter.INSTANCE);
    Utils.writeNullable(data.getDeadline(), dest, flags, DateTimeAdapter.INSTANCE);
    PaperParcelProject.PROJECT_URLS_PARCELABLE_ADAPTER.writeToParcel(data.getUrls(), dest, flags);
  }
}
