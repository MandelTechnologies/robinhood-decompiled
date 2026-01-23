package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.view.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthActivityStarterHost.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/view/ActivityHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Landroidx/activity/ComponentActivity;", "activity", "", "statusBarColor", "<init>", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "requestCode", "", "startActivityForResult", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "Landroidx/activity/ComponentActivity;", "getActivity", "()Landroidx/activity/ComponentActivity;", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.view.ActivityHost, reason: use source file name */
/* loaded from: classes26.dex */
public final class AuthActivityStarterHost2 implements AuthActivityStarterHost {
    private final ComponentActivity activity;
    private final LifecycleOwner lifecycleOwner;
    private final Integer statusBarColor;

    public AuthActivityStarterHost2(ComponentActivity activity, Integer num) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.statusBarColor = num;
        this.lifecycleOwner = activity;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public void startActivityForResult(Class<?> target, Bundle extras, int requestCode) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intent intentPutExtras = new Intent(this.activity, target).putExtras(extras);
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        this.activity.startActivityForResult(intentPutExtras, requestCode);
    }
}
