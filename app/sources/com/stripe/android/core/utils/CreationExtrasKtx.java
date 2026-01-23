package com.stripe.android.core.utils;

import android.app.Application;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreationExtrasKtx.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, m3636d2 = {"requireApplication", "Landroid/app/Application;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "stripe-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.utils.CreationExtrasKtxKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class CreationExtrasKtx {
    public static final Application requireApplication(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "<this>");
        Object obj = creationExtras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        if (obj != null) {
            return (Application) obj;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
