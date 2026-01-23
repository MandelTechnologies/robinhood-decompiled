package com.plaid.link.internal;

import android.app.Application;
import kotlin.Metadata;

@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/plaid/link/internal/PlaidComponentProvider;", "T", "", "providePlaidComponent", "application", "Landroid/app/Application;", "(Landroid/app/Application;)Ljava/lang/Object;", "link-sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface PlaidComponentProvider<T> {
    T providePlaidComponent(Application application);
}
