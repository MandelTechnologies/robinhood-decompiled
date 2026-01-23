package com.robinhood.android.common.gold;

import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "", "<init>", "()V", "Loading", "Loaded", "Error", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Error;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loaded;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loading;", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementViewState, reason: use source file name */
/* loaded from: classes2.dex */
public abstract class LegacyGoldUpgradeAgreementViewState2 {
    public static final int $stable = 0;

    public /* synthetic */ LegacyGoldUpgradeAgreementViewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loading;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementViewState$Loading */
    public static final /* data */ class Loading extends LegacyGoldUpgradeAgreementViewState2 {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1866198323;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private LegacyGoldUpgradeAgreementViewState2() {
    }

    /* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u001dJ\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loaded;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "status", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;", "disclosureMarkdown", "", "disclosureAcceptText", "Lcom/robinhood/utils/resource/StringResource;", "ctaText", "card", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement$Card;", "selectedPlanId", "Ljava/util/UUID;", "forceDarkMode", "", "<init>", "(Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement$Card;Ljava/util/UUID;Ljava/lang/Boolean;)V", "getStatus", "()Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;", "getDisclosureMarkdown", "()Ljava/lang/String;", "getDisclosureAcceptText", "()Lcom/robinhood/utils/resource/StringResource;", "getCtaText", "getCard", "()Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement$Card;", "getSelectedPlanId", "()Ljava/util/UUID;", "getForceDarkMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/android/common/gold/GoldUpgradeAgreementLoadedStatus;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement$Card;Ljava/util/UUID;Ljava/lang/Boolean;)Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Loaded;", "equals", "other", "", "hashCode", "", "toString", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementViewState$Loaded, reason: from toString */
    public static final /* data */ class Loaded extends LegacyGoldUpgradeAgreementViewState2 {
        public static final int $stable = 8;
        private final ApiGoldSweepAgreement.Card card;
        private final StringResource ctaText;
        private final StringResource disclosureAcceptText;
        private final String disclosureMarkdown;
        private final Boolean forceDarkMode;
        private final UUID selectedPlanId;
        private final LegacyGoldUpgradeAgreementDataState2 status;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, LegacyGoldUpgradeAgreementDataState2 legacyGoldUpgradeAgreementDataState2, String str, StringResource stringResource, StringResource stringResource2, ApiGoldSweepAgreement.Card card, UUID uuid, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                legacyGoldUpgradeAgreementDataState2 = loaded.status;
            }
            if ((i & 2) != 0) {
                str = loaded.disclosureMarkdown;
            }
            if ((i & 4) != 0) {
                stringResource = loaded.disclosureAcceptText;
            }
            if ((i & 8) != 0) {
                stringResource2 = loaded.ctaText;
            }
            if ((i & 16) != 0) {
                card = loaded.card;
            }
            if ((i & 32) != 0) {
                uuid = loaded.selectedPlanId;
            }
            if ((i & 64) != 0) {
                bool = loaded.forceDarkMode;
            }
            UUID uuid2 = uuid;
            Boolean bool2 = bool;
            ApiGoldSweepAgreement.Card card2 = card;
            StringResource stringResource3 = stringResource;
            return loaded.copy(legacyGoldUpgradeAgreementDataState2, str, stringResource3, stringResource2, card2, uuid2, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyGoldUpgradeAgreementDataState2 getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getDisclosureAcceptText() {
            return this.disclosureAcceptText;
        }

        /* renamed from: component4, reason: from getter */
        public final StringResource getCtaText() {
            return this.ctaText;
        }

        /* renamed from: component5, reason: from getter */
        public final ApiGoldSweepAgreement.Card getCard() {
            return this.card;
        }

        /* renamed from: component6, reason: from getter */
        public final UUID getSelectedPlanId() {
            return this.selectedPlanId;
        }

        /* renamed from: component7, reason: from getter */
        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        public final Loaded copy(LegacyGoldUpgradeAgreementDataState2 status, String disclosureMarkdown, StringResource disclosureAcceptText, StringResource ctaText, ApiGoldSweepAgreement.Card card, UUID selectedPlanId, Boolean forceDarkMode) {
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            return new Loaded(status, disclosureMarkdown, disclosureAcceptText, ctaText, card, selectedPlanId, forceDarkMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.status == loaded.status && Intrinsics.areEqual(this.disclosureMarkdown, loaded.disclosureMarkdown) && Intrinsics.areEqual(this.disclosureAcceptText, loaded.disclosureAcceptText) && Intrinsics.areEqual(this.ctaText, loaded.ctaText) && Intrinsics.areEqual(this.card, loaded.card) && Intrinsics.areEqual(this.selectedPlanId, loaded.selectedPlanId) && Intrinsics.areEqual(this.forceDarkMode, loaded.forceDarkMode);
        }

        public int hashCode() {
            int iHashCode = ((this.status.hashCode() * 31) + this.disclosureMarkdown.hashCode()) * 31;
            StringResource stringResource = this.disclosureAcceptText;
            int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.ctaText.hashCode()) * 31;
            ApiGoldSweepAgreement.Card card = this.card;
            int iHashCode3 = (iHashCode2 + (card == null ? 0 : card.hashCode())) * 31;
            UUID uuid = this.selectedPlanId;
            int iHashCode4 = (iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            Boolean bool = this.forceDarkMode;
            return iHashCode4 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Loaded(status=" + this.status + ", disclosureMarkdown=" + this.disclosureMarkdown + ", disclosureAcceptText=" + this.disclosureAcceptText + ", ctaText=" + this.ctaText + ", card=" + this.card + ", selectedPlanId=" + this.selectedPlanId + ", forceDarkMode=" + this.forceDarkMode + ")";
        }

        public final LegacyGoldUpgradeAgreementDataState2 getStatus() {
            return this.status;
        }

        public final String getDisclosureMarkdown() {
            return this.disclosureMarkdown;
        }

        public final StringResource getDisclosureAcceptText() {
            return this.disclosureAcceptText;
        }

        public final StringResource getCtaText() {
            return this.ctaText;
        }

        public final ApiGoldSweepAgreement.Card getCard() {
            return this.card;
        }

        public final UUID getSelectedPlanId() {
            return this.selectedPlanId;
        }

        public final Boolean getForceDarkMode() {
            return this.forceDarkMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(LegacyGoldUpgradeAgreementDataState2 status, String disclosureMarkdown, StringResource stringResource, StringResource ctaText, ApiGoldSweepAgreement.Card card, UUID uuid, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
            Intrinsics.checkNotNullParameter(ctaText, "ctaText");
            this.status = status;
            this.disclosureMarkdown = disclosureMarkdown;
            this.disclosureAcceptText = stringResource;
            this.ctaText = ctaText;
            this.card = card;
            this.selectedPlanId = uuid;
            this.forceDarkMode = bool;
        }
    }

    /* compiled from: LegacyGoldUpgradeAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState$Error;", "Lcom/robinhood/android/common/gold/GoldUpgradeAgreementViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.gold.GoldUpgradeAgreementViewState$Error, reason: from toString */
    public static final /* data */ class Error extends LegacyGoldUpgradeAgreementViewState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
