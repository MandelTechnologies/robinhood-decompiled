package com.robinhood.android.odyssey.lib.navigation;

import com.robinhood.android.odyssey.lib.template.SdBackendMetadata;
import com.robinhood.android.odyssey.lib.template.SdBackendMetadata2;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPageDependency;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SdNavigationUtil.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u001a.\u0010\b\u001a\u00020\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n0\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0000¨\u0006\u000e"}, m3636d2 = {"areAnyDependenciesSatisfied", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "metadataToValues", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "areAllDependenciesSatisfied", "toContentString", "", "", "pageContent", "Lkotlin/Function1;", "", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.odyssey.lib.navigation.SdNavigationUtilKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdNavigationUtil {
    public static final boolean areAnyDependenciesSatisfied(ApiSdPage apiSdPage, Map<SdBackendMetadata, ? extends ApiSdTypedValue> metadataToValues) {
        Intrinsics.checkNotNullParameter(apiSdPage, "<this>");
        Intrinsics.checkNotNullParameter(metadataToValues, "metadataToValues");
        List<ApiSdPageDependency> dependencies = apiSdPage.getDependencies();
        if (dependencies == null || dependencies.isEmpty()) {
            return true;
        }
        List<ApiSdPageDependency> dependencies2 = apiSdPage.getDependencies();
        Intrinsics.checkNotNull(dependencies2);
        List<ApiSdPageDependency> list = dependencies2;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ApiSdPageDependency apiSdPageDependency : list) {
            ApiSdTypedValue apiSdTypedValue = metadataToValues.get(SdBackendMetadata2.getSdBackendMetaData(apiSdPageDependency));
            if (apiSdTypedValue != null ? apiSdPageDependency.getEntity_values().contains(apiSdTypedValue) : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean areAllDependenciesSatisfied(ApiSdPage apiSdPage, Map<SdBackendMetadata, ? extends ApiSdTypedValue> metadataToValues) {
        Intrinsics.checkNotNullParameter(apiSdPage, "<this>");
        Intrinsics.checkNotNullParameter(metadataToValues, "metadataToValues");
        List<ApiSdPageDependency> dependencies = apiSdPage.getDependencies();
        if (dependencies != null && !dependencies.isEmpty()) {
            List<ApiSdPageDependency> dependencies2 = apiSdPage.getDependencies();
            Intrinsics.checkNotNull(dependencies2);
            List<ApiSdPageDependency> list = dependencies2;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            for (ApiSdPageDependency apiSdPageDependency : list) {
                ApiSdTypedValue apiSdTypedValue = metadataToValues.get(SdBackendMetadata2.getSdBackendMetaData(apiSdPageDependency));
                if (!(apiSdTypedValue != null ? apiSdPageDependency.getEntity_values().contains(apiSdTypedValue) : false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static /* synthetic */ String toContentString$default(List list, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: com.robinhood.android.odyssey.lib.navigation.SdNavigationUtilKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return SdNavigationUtil.toContentString$lambda$4((ApiSdPage) obj2);
                }
            };
        }
        return toContentString(list, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toContentString$lambda$4(ApiSdPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPage_key();
    }

    public static final String toContentString(List<? extends List<? extends ApiSdPage>> list, final Function1<? super ApiSdPage, ? extends Object> pageContent) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        return CollectionsKt.joinToString$default(list, ",", "[", "]", 0, null, new Function1() { // from class: com.robinhood.android.odyssey.lib.navigation.SdNavigationUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdNavigationUtil.toContentString$lambda$6(pageContent, (List) obj);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toContentString$lambda$6(final Function1 function1, List pagesBlock) {
        Intrinsics.checkNotNullParameter(pagesBlock, "pagesBlock");
        return CollectionsKt.joinToString$default(pagesBlock, ",", "[", "]", 0, null, new Function1() { // from class: com.robinhood.android.odyssey.lib.navigation.SdNavigationUtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdNavigationUtil.toContentString$lambda$6$lambda$5(function1, (ApiSdPage) obj);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toContentString$lambda$6$lambda$5(Function1 function1, ApiSdPage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function1.invoke(it).toString();
    }
}
