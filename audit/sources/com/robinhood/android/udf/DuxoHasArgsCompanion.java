package com.robinhood.android.udf;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DuxoHasArgsCompanion.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005R\u001e\u0010\u0006\u001a\u00028\u0001*\u00020\u00078VX\u0096\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u00028\u0001*\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "S", "Lcom/robinhood/android/udf/HasArgs;", "T", "Landroid/os/Parcelable;", "", "args", "Landroidx/lifecycle/SavedStateHandle;", "getArgs$annotations", "(Landroidx/lifecycle/SavedStateHandle;)V", "getArgs", "(Landroidx/lifecycle/SavedStateHandle;)Landroid/os/Parcelable;", "(Lcom/robinhood/android/udf/HasArgs;)Landroid/os/Parcelable;", "lib-udf_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface DuxoHasArgsCompanion<S extends HasArgs<T>, T extends Parcelable> {
    T getArgs(SavedStateHandle savedStateHandle);

    T getArgs(S s);

    /* compiled from: DuxoHasArgsCompanion.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getArgs$annotations(SavedStateHandle savedStateHandle) {
        }

        public static <S extends HasArgs<T>, T extends Parcelable> T getArgs(DuxoHasArgsCompanion<S, T> duxoHasArgsCompanion, SavedStateHandle receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Bundle bundle = (Bundle) receiver.get(HammerViewModelFactory3.SAVED_STATE_HANDLE_INIT_ARG_KEY);
            T t = bundle != null ? (T) bundle.getParcelable(HammerViewModelFactory3.CREATION_INIT_ARG_KEY) : null;
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of com.robinhood.android.udf.DuxoHasArgsCompanion");
            return t;
        }

        public static <S extends HasArgs<T>, T extends Parcelable> T getArgs(DuxoHasArgsCompanion<S, T> duxoHasArgsCompanion, S receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (T) receiver.getArgs(receiver.getSavedStateHandle());
        }
    }
}
