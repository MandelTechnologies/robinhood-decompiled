package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AutoClassificationRenderer.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¨\u0006\u0007"}, m3636d2 = {"getString", "", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "countryCode", "idClass", "page", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRendererKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class AutoClassificationRenderer4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getString(List<NextStep.GovernmentId.LocalizationOverride> list, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            NextStep.GovernmentId.LocalizationOverride localizationOverride = (NextStep.GovernmentId.LocalizationOverride) obj;
            if (StringsKt.equals(localizationOverride.getCountryCode(), str, true) && Intrinsics.areEqual(localizationOverride.getPage(), str3) && (Intrinsics.areEqual(localizationOverride.getIdClass(), str2) || localizationOverride.getIdClass() == null)) {
                if (Intrinsics.areEqual(localizationOverride.getKey(), str2)) {
                    arrayList.add(obj);
                }
            }
        }
        NextStep.GovernmentId.LocalizationOverride localizationOverride2 = (NextStep.GovernmentId.LocalizationOverride) CollectionsKt.firstOrNull((List) arrayList);
        if (localizationOverride2 != null) {
            return localizationOverride2.getText();
        }
        return null;
    }
}
