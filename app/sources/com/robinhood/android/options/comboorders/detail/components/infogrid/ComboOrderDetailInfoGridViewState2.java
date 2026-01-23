package com.robinhood.android.options.comboorders.detail.components.infogrid;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ComboOrderDetailInfoGridViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0001\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/options/comboorders/detail/components/infogrid/ComboOrderDetailGridItemViewState;", "", AnnotatedPrivateKey.LABEL, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getValue", "Lcom/robinhood/android/options/comboorders/detail/components/infogrid/DefaultGridItem;", "feature-combo-order-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailGridItemViewState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class ComboOrderDetailInfoGridViewState2 {
    public static final int $stable = 0;
    private final String label;
    private final String value;

    public /* synthetic */ ComboOrderDetailInfoGridViewState2(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private ComboOrderDetailInfoGridViewState2(String str, String str2) {
        this.label = str;
        this.value = str2;
    }

    public String getLabel() {
        return this.label;
    }

    public String getValue() {
        return this.value;
    }
}
