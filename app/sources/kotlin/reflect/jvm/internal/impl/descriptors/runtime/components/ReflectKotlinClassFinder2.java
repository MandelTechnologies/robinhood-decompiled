package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.robinhood.android.tickerinputview.TickerInputView;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;

/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinderKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class ReflectKotlinClassFinder2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strReplace$default = StringsKt.replace$default(classId.getRelativeClassName().asString(), '.', TickerInputView.CURRENCY_SYMBOL, false, 4, (Object) null);
        if (classId.getPackageFqName().isRoot()) {
            return strReplace$default;
        }
        return classId.getPackageFqName() + '.' + strReplace$default;
    }
}
