// Generated by paperparcel.PaperParcelProcessor (https://github.com/grandstaish/paperparcel).
package com.byoutline.kickmaterial.features.rewardlist;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

final class PaperParcelRewardHeader {
  @NonNull
  static final Parcelable.Creator<RewardHeader> CREATOR =
      new Parcelable.Creator<RewardHeader>() {
        @Override
        public RewardHeader createFromParcel(Parcel in) {
          int minimum = in.readInt();
          RewardHeader data = new RewardHeader(minimum);
          return data;
        }

        @Override
        public RewardHeader[] newArray(int size) {
          return new RewardHeader[size];
        }
      };

  private PaperParcelRewardHeader() {}

  static void writeToParcel(@NonNull RewardHeader data, @NonNull Parcel dest, int flags) {
    dest.writeInt(data.getMinimum());
  }
}