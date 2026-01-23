package com.robinhood.android.designsystem.text;

import android.text.style.ClickableSpan;
import android.view.View;
import com.robinhood.utils.system.References;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: WeakReferenceClickableSpan.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/designsystem/text/WeakReferenceClickableSpan;", "Landroid/text/style/ClickableSpan;", "delegate", "<init>", "(Landroid/text/style/ClickableSpan;)V", "getDelegate", "()Landroid/text/style/ClickableSpan;", "delegate$delegate", "Lkotlin/properties/ReadWriteProperty;", "onClick", "", "widget", "Landroid/view/View;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class WeakReferenceClickableSpan extends ClickableSpan {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WeakReferenceClickableSpan.class, "delegate", "getDelegate()Landroid/text/style/ClickableSpan;", 0))};

    /* renamed from: delegate$delegate, reason: from kotlin metadata */
    private final Interfaces3 delegate;

    public WeakReferenceClickableSpan(ClickableSpan delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = References.weak(delegate);
    }

    private final ClickableSpan getDelegate() {
        return (ClickableSpan) this.delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        ClickableSpan delegate = getDelegate();
        if (delegate != null) {
            delegate.onClick(widget);
        }
    }
}
