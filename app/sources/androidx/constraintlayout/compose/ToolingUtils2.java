package androidx.constraintlayout.compose;

import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* compiled from: ToolingUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\"\u001d\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"5\u0010\u0010\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00018@@@X\u0081\u008e\u0002¢\u0006\u0018\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b*\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "<set-?>", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getDesignInfoProvider$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "designInfoProvider", "constraintlayout-compose_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.constraintlayout.compose.ToolingUtilsKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class ToolingUtils2 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ToolingUtils2.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};
    private static final SemanticsPropertyKey<ToolingUtils> DesignInfoDataKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, ToolingUtils toolingUtils) {
        DesignInfoDataKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], toolingUtils);
    }
}
