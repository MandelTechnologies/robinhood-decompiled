package com.mux.stats.sdk.muxstats;

import android.graphics.Point;
import com.mux.android.util.Weak2;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: MuxUiDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bR/\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "PV", "", "view", "<init>", "(Ljava/lang/Object;)V", "Landroid/graphics/Point;", "getPlayerViewSize", "()Landroid/graphics/Point;", "", "displayDensity", "()F", "<set-?>", "view$delegate", "Lkotlin/properties/ReadWriteProperty;", "getView", "()Ljava/lang/Object;", "setView", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public abstract class MuxUiDelegate<PV> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MuxUiDelegate.class, "view", "getView()Ljava/lang/Object;", 0))};

    /* renamed from: view$delegate, reason: from kotlin metadata */
    private final Interfaces3 view;

    public abstract float displayDensity();

    public abstract Point getPlayerViewSize();

    public MuxUiDelegate(PV pv) {
        this.view = Weak2.weak(pv);
    }

    public PV getView() {
        return (PV) this.view.getValue(this, $$delegatedProperties[0]);
    }

    public void setView(PV pv) {
        this.view.setValue(this, $$delegatedProperties[0], pv);
    }
}
