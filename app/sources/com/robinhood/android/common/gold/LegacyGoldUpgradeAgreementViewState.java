package com.robinhood.android.common.gold;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementViewState2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\t*\u00020\u0002H\u0002J\u000e\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0002H\u0002¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementDataState;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "<init>", "()V", "reduce", "dataState", "ctaText", "Lcom/robinhood/utils/resource/StringResource;", "disclosureAcceptText", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class LegacyGoldUpgradeAgreementViewState implements StateProvider<GoldUpgradeAgreementDataState, LegacyGoldUpgradeAgreementViewState2> {
    public static final int $stable = 0;

    /* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementStateProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LegacyGoldUpgradeAgreementDataState2.values().length];
            try {
                iArr[LegacyGoldUpgradeAgreementDataState2.UNREVIEWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LegacyGoldUpgradeAgreementDataState2.REVIEWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LegacyGoldUpgradeAgreementDataState2.ACCEPTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public LegacyGoldUpgradeAgreementViewState2 reduce(GoldUpgradeAgreementDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getError() != null || dataState.getGoldAgreement() == null) {
            Throwable error = dataState.getError();
            if (error == null) {
                error = new IllegalStateException("Gold agreement should not be null");
            }
            return new LegacyGoldUpgradeAgreementViewState2.Error(error);
        }
        if (dataState.getDisclosureMarkdown() != null) {
            return new LegacyGoldUpgradeAgreementViewState2.Loaded(dataState.getLoadedStatus(), dataState.getDisclosureMarkdown(), disclosureAcceptText(dataState), ctaText(dataState), dataState.getGoldAgreement().getCard(), dataState.getSelectedPlanId(), dataState.getGoldAgreement().getForceDarkMode());
        }
        return LegacyGoldUpgradeAgreementViewState2.Loading.INSTANCE;
    }

    private final StringResource ctaText(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState) {
        int i = WhenMappings.$EnumSwitchMapping$0[goldUpgradeAgreementDataState.getLoadedStatus().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_review, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_action_agree, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C11048R.string.general_action_agree, new Object[0]);
    }

    private final StringResource disclosureAcceptText(GoldUpgradeAgreementDataState goldUpgradeAgreementDataState) {
        ApiGoldSweepAgreement goldAgreement;
        String footer;
        if (goldUpgradeAgreementDataState.getLoadedStatus() == LegacyGoldUpgradeAgreementDataState2.UNREVIEWED || (goldAgreement = goldUpgradeAgreementDataState.getGoldAgreement()) == null || (footer = goldAgreement.getFooter()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(footer);
    }
}
