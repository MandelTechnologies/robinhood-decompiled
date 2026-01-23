package com.robinhood.android.udf;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DuxoCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\n\b\u0001\u0010\u0003*\u0004\u0018\u00010\u00042\u00020\u0005R\u0018\u0010\u0006\u001a\u00028\u0001*\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/udf/DuxoCompanion;", "S", "Lcom/robinhood/android/udf/HasSavedState;", "A", "Landroid/os/Parcelable;", "", "args", "Landroidx/lifecycle/SavedStateHandle;", "getArgs", "(Landroidx/lifecycle/SavedStateHandle;)Landroid/os/Parcelable;", "(Lcom/robinhood/android/udf/HasSavedState;)Landroid/os/Parcelable;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface DuxoCompanion<S extends HasSavedState, A extends Parcelable> {
    A getArgs(SavedStateHandle savedStateHandle);

    A getArgs(S s);

    /* compiled from: DuxoCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <S extends HasSavedState, A extends Parcelable> A getArgs(DuxoCompanion<S, A> duxoCompanion, SavedStateHandle receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) receiver.get("rh_navigation_args");
        }

        public static <S extends HasSavedState, A extends Parcelable> A getArgs(DuxoCompanion<S, A> duxoCompanion, S receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (A) duxoCompanion.getArgs(receiver.getSavedStateHandle());
        }
    }
}
