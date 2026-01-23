package com.truelayer.payments.p419ui.theme;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ThemeConverter.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aQ\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u0001`\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0004H\u0082\b*$\b\u0000\u0010\u0006\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*$\b\u0000\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*<\b\u0000\u0010\b\"\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0004`\u00042\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00010\u0001*<\b\u0000\u0010\t\"\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0004`\u00042\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u0001¨\u0006\n"}, m3636d2 = {"safeCast", "Ljava/util/HashMap;", "", "T", "Lkotlin/collections/HashMap;", "", "TrueLayerColorMap", "TrueLayerTextStyleMap", "TrueLayerThemeMap", "TrueLayerTypographyMap", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.theme.ThemeConverterKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ThemeConverter2 {
    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> HashMap<String, T> safeCast(HashMap<String, Object> map) {
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (T t : collectionValues) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (t == null) {
                arrayList.add(t);
            }
        }
        if (!arrayList.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, T of com.truelayer.payments.ui.theme.ThemeConverterKt.safeCast>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, T of com.truelayer.payments.ui.theme.ThemeConverterKt.safeCast> }");
        return map;
    }
}
