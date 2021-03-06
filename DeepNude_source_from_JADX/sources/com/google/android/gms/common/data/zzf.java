package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.internal.view.SupportMenu;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.internal.zzbgm;

@Hide
public final class zzf implements Creator<DataHolder> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int zzd = zzbgm.zzd(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = strArr;
        Bundle bundle = cursorWindowArr;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            int i3 = SupportMenu.USER_MASK & readInt;
            if (i3 == 1) {
                strArr = zzbgm.zzaa(parcel, readInt);
            } else if (i3 == 2) {
                cursorWindowArr = (CursorWindow[]) zzbgm.zzb(parcel, readInt, CursorWindow.CREATOR);
            } else if (i3 == 3) {
                i2 = zzbgm.zzg(parcel, readInt);
            } else if (i3 == 4) {
                bundle = zzbgm.zzs(parcel, readInt);
            } else if (i3 != 1000) {
                zzbgm.zzb(parcel, readInt);
            } else {
                i = zzbgm.zzg(parcel, readInt);
            }
        }
        zzbgm.zzaf(parcel, zzd);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.zzali();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
