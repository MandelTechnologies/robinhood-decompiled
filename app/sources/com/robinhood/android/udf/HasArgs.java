package com.robinhood.android.udf;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HasArgs.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u001e\u0010\u0004\u001a\u00028\u0000*\u00020\u00058VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/udf/HasArgs;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/android/udf/HasSavedState;", "args", "Landroidx/lifecycle/SavedStateHandle;", "getArgs$annotations", "(Landroidx/lifecycle/SavedStateHandle;)V", "getArgs", "(Landroidx/lifecycle/SavedStateHandle;)Landroid/os/Parcelable;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface HasArgs<T extends Parcelable> extends HasSavedState {
    T getArgs(SavedStateHandle savedStateHandle);

    /* compiled from: HasArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getArgs$annotations(SavedStateHandle savedStateHandle) {
        }

        public static <T extends Parcelable> T getArgs(HasArgs<T> hasArgs, SavedStateHandle receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Bundle bundle = (Bundle) receiver.get(HammerViewModelFactory3.SAVED_STATE_HANDLE_INIT_ARG_KEY);
            T t = bundle != null ? (T) bundle.getParcelable(HammerViewModelFactory3.CREATION_INIT_ARG_KEY) : null;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.robinhood.android.udf.HasArgs");
            return t;
        }
    }
}
