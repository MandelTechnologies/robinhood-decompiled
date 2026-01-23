package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: predefinedEnhancementInfo.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo, reason: use source file name */
/* loaded from: classes14.dex */
public final class predefinedEnhancementInfo2 {
    private final String errorsSinceLanguageVersion;
    private final List<predefinedEnhancementInfo4> parametersInfo;
    private final predefinedEnhancementInfo4 returnTypeInfo;
    private final predefinedEnhancementInfo2 warningModeClone;

    public predefinedEnhancementInfo2() {
        this(null, null, null, 7, null);
    }

    public predefinedEnhancementInfo2(predefinedEnhancementInfo4 predefinedenhancementinfo4, List<predefinedEnhancementInfo4> parametersInfo, String str) {
        Intrinsics.checkNotNullParameter(parametersInfo, "parametersInfo");
        this.returnTypeInfo = predefinedenhancementinfo4;
        this.parametersInfo = parametersInfo;
        this.errorsSinceLanguageVersion = str;
        predefinedEnhancementInfo2 predefinedenhancementinfo2 = null;
        if (str != null) {
            predefinedEnhancementInfo4 predefinedenhancementinfo4CopyForWarnings = predefinedenhancementinfo4 != null ? predefinedenhancementinfo4.copyForWarnings() : null;
            List<predefinedEnhancementInfo4> list = parametersInfo;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (predefinedEnhancementInfo4 predefinedenhancementinfo42 : list) {
                arrayList.add(predefinedenhancementinfo42 != null ? predefinedenhancementinfo42.copyForWarnings() : null);
            }
            predefinedenhancementinfo2 = new predefinedEnhancementInfo2(predefinedenhancementinfo4CopyForWarnings, arrayList, null);
        }
        this.warningModeClone = predefinedenhancementinfo2;
    }

    public final predefinedEnhancementInfo4 getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public /* synthetic */ predefinedEnhancementInfo2(predefinedEnhancementInfo4 predefinedenhancementinfo4, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : predefinedenhancementinfo4, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str);
    }

    public final List<predefinedEnhancementInfo4> getParametersInfo() {
        return this.parametersInfo;
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    public final predefinedEnhancementInfo2 getWarningModeClone() {
        return this.warningModeClone;
    }
}
