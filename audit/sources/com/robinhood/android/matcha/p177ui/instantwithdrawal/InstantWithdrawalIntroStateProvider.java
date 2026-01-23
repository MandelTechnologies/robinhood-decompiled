package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import com.robinhood.android.matcha.p177ui.instantwithdrawal.InstantWithdrawalIntroViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.staticcontent.model.disclosure.DisclosureContent;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantWithdrawalIntroStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDataState;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;", "<init>", "()V", "reduce", "dataState", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroStateProvider implements StateProvider<InstantWithdrawalIntroDataState, InstantWithdrawalIntroViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public InstantWithdrawalIntroViewState reduce(InstantWithdrawalIntroDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getContent() == null) {
            return dataState.getError() != null ? new InstantWithdrawalIntroViewState.Error(dataState.getError()) : InstantWithdrawalIntroViewState.Loading.INSTANCE;
        }
        String pageTitle = dataState.getContent().getPageTitle();
        List<ProductMarketingContent.Feature> features = dataState.getContent().getFeatures();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(features, 10));
        for (ProductMarketingContent.Feature feature : features) {
            arrayList.add(new InstantWithdrawalIntroViewState.Loaded.Bullet(feature.getTitle(), feature.getDescription().toString()));
        }
        DisclosureContent disclosure = dataState.getContent().getDisclosure();
        return new InstantWithdrawalIntroViewState.Loaded(pageTitle, disclosure != null ? disclosure.getContent() : null, arrayList);
    }
}
