package com.robinhood.android.acatsin.enablemargin;

import bonfire.proto.idl.margin.p036v1.GetMultiAccountEligibilityResponseDto;
import bonfire.proto.idl.margin.p036v1.MultiAccountIneligibilityContentModelDto;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.enablemargin.AcatsInEnableMarginViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInEnableMarginStateProvider.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginDataState;", "Lcom/robinhood/android/acatsin/enablemargin/AcatsInEnableMarginViewState;", "<init>", "()V", "reduce", "dataState", "getTitleText", "Lcom/robinhood/utils/resource/StringResource;", "isEligible", "", "ineligibleTitle", "", "getContentMarkdown", "inHoodMonth2025Promo", "ineligibleContent", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInEnableMarginStateProvider implements StateProvider<AcatsInEnableMarginDataState, AcatsInEnableMarginViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AcatsInEnableMarginViewState reduce(AcatsInEnableMarginDataState dataState) {
        MultiAccountIneligibilityContentModelDto ineligibility_content;
        MultiAccountIneligibilityContentModelDto ineligibility_content2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getCompletedInitialLoad()) {
            boolean inHoodMonth2025Promo = dataState.getInHoodMonth2025Promo();
            GetMultiAccountEligibilityResponseDto multiAccountMarginEligibility = dataState.getMultiAccountMarginEligibility();
            boolean z = multiAccountMarginEligibility == null || multiAccountMarginEligibility.is_eligible();
            String body_markdown = null;
            String title = (multiAccountMarginEligibility == null || (ineligibility_content2 = multiAccountMarginEligibility.getIneligibility_content()) == null) ? null : ineligibility_content2.getTitle();
            if (multiAccountMarginEligibility != null && (ineligibility_content = multiAccountMarginEligibility.getIneligibility_content()) != null) {
                body_markdown = ineligibility_content.getBody_markdown();
            }
            return new AcatsInEnableMarginViewState.Loaded(getTitleText(z, title), getContentMarkdown(z, inHoodMonth2025Promo, body_markdown), z, inHoodMonth2025Promo);
        }
        return AcatsInEnableMarginViewState.Loading.INSTANCE;
    }

    private final StringResource getTitleText(boolean isEligible, String ineligibleTitle) {
        if (!isEligible && ineligibleTitle != null) {
            return StringResource.INSTANCE.invoke(ineligibleTitle);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.acats_in_enable_margin_title, new Object[0]);
    }

    private final StringResource getContentMarkdown(boolean isEligible, boolean inHoodMonth2025Promo, String ineligibleContent) {
        if (!isEligible && ineligibleContent != null) {
            return StringResource.INSTANCE.invoke(ineligibleContent);
        }
        if (inHoodMonth2025Promo) {
            return StringResource.INSTANCE.invoke(C7725R.string.acats_in_enable_margin_message_hood_month_2025_promo, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C7725R.string.acats_in_enable_margin_message, new Object[0]);
    }
}
