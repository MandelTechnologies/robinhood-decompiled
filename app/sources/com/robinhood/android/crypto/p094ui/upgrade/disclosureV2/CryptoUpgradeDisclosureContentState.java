package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureCheckboxContentSectionState;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoUpgradeDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "subtitleContent", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "contents", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content;", "agreementIds", "Ljava/util/UUID;", "<init>", "(ILbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getIndex", "()I", "getSubtitleContent", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SubtitleContentDto;", "getContents", "()Lkotlinx/collections/immutable/ImmutableList;", "getAgreementIds", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Content", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoUpgradeDisclosureContentState {
    public static final int $stable = 8;
    private final ImmutableList<UUID> agreementIds;
    private final ImmutableList<Content> contents;
    private final int index;
    private final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoUpgradeDisclosureContentState copy$default(CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState, int i, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContentDto, ImmutableList immutableList, ImmutableList immutableList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cryptoUpgradeDisclosureContentState.index;
        }
        if ((i2 & 2) != 0) {
            subtitleContentDto = cryptoUpgradeDisclosureContentState.subtitleContent;
        }
        if ((i2 & 4) != 0) {
            immutableList = cryptoUpgradeDisclosureContentState.contents;
        }
        if ((i2 & 8) != 0) {
            immutableList2 = cryptoUpgradeDisclosureContentState.agreementIds;
        }
        return cryptoUpgradeDisclosureContentState.copy(i, subtitleContentDto, immutableList, immutableList2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component2, reason: from getter */
    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto getSubtitleContent() {
        return this.subtitleContent;
    }

    public final ImmutableList<Content> component3() {
        return this.contents;
    }

    public final ImmutableList<UUID> component4() {
        return this.agreementIds;
    }

    public final CryptoUpgradeDisclosureContentState copy(int index, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContent, ImmutableList<? extends Content> contents, ImmutableList<UUID> agreementIds) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(agreementIds, "agreementIds");
        return new CryptoUpgradeDisclosureContentState(index, subtitleContent, contents, agreementIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoUpgradeDisclosureContentState)) {
            return false;
        }
        CryptoUpgradeDisclosureContentState cryptoUpgradeDisclosureContentState = (CryptoUpgradeDisclosureContentState) other;
        return this.index == cryptoUpgradeDisclosureContentState.index && Intrinsics.areEqual(this.subtitleContent, cryptoUpgradeDisclosureContentState.subtitleContent) && Intrinsics.areEqual(this.contents, cryptoUpgradeDisclosureContentState.contents) && Intrinsics.areEqual(this.agreementIds, cryptoUpgradeDisclosureContentState.agreementIds);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index) * 31;
        GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContentDto = this.subtitleContent;
        return ((((iHashCode + (subtitleContentDto == null ? 0 : subtitleContentDto.hashCode())) * 31) + this.contents.hashCode()) * 31) + this.agreementIds.hashCode();
    }

    public String toString() {
        return "CryptoUpgradeDisclosureContentState(index=" + this.index + ", subtitleContent=" + this.subtitleContent + ", contents=" + this.contents + ", agreementIds=" + this.agreementIds + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoUpgradeDisclosureContentState(int i, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto subtitleContentDto, ImmutableList<? extends Content> contents, ImmutableList<UUID> agreementIds) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        Intrinsics.checkNotNullParameter(agreementIds, "agreementIds");
        this.index = i;
        this.subtitleContent = subtitleContentDto;
        this.contents = contents;
        this.agreementIds = agreementIds;
    }

    public final int getIndex() {
        return this.index;
    }

    public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SubtitleContentDto getSubtitleContent() {
        return this.subtitleContent;
    }

    public final ImmutableList<Content> getContents() {
        return this.contents;
    }

    public final ImmutableList<UUID> getAgreementIds() {
        return this.agreementIds;
    }

    /* compiled from: CryptoUpgradeDisclosureComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content;", "", "<init>", "()V", "Checkbox", "Markdown", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content$Checkbox;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content$Markdown;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Content {
        public static final int $stable = 0;

        public /* synthetic */ Content(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CryptoUpgradeDisclosureComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content$Checkbox;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content;", "state", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureCheckboxContentSectionState;", "<init>", "(Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureCheckboxContentSectionState;)V", "getState", "()Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureCheckboxContentSectionState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Checkbox extends Content {
            public static final int $stable = 8;
            private final CryptoUpgradeDisclosureCheckboxContentSectionState state;

            public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, CryptoUpgradeDisclosureCheckboxContentSectionState cryptoUpgradeDisclosureCheckboxContentSection5, int i, Object obj) {
                if ((i & 1) != 0) {
                    cryptoUpgradeDisclosureCheckboxContentSection5 = checkbox.state;
                }
                return checkbox.copy(cryptoUpgradeDisclosureCheckboxContentSection5);
            }

            /* renamed from: component1, reason: from getter */
            public final CryptoUpgradeDisclosureCheckboxContentSectionState getState() {
                return this.state;
            }

            public final Checkbox copy(CryptoUpgradeDisclosureCheckboxContentSectionState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Checkbox(state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Checkbox) && Intrinsics.areEqual(this.state, ((Checkbox) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Checkbox(state=" + this.state + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Checkbox(CryptoUpgradeDisclosureCheckboxContentSectionState state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public final CryptoUpgradeDisclosureCheckboxContentSectionState getState() {
                return this.state;
            }
        }

        private Content() {
        }

        /* compiled from: CryptoUpgradeDisclosureComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content$Markdown;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/CryptoUpgradeDisclosureContentState$Content;", "state", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;)V", "getState", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponseDto$CryptoAgreementDto$SignableAgreementDto$AgreementContentSectionDto$MarkdownDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Markdown extends Content {
            public static final int $stable = 8;
            private final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto state;

            public static /* synthetic */ Markdown copy$default(Markdown markdown, GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto markdownDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    markdownDto = markdown.state;
                }
                return markdown.copy(markdownDto);
            }

            /* renamed from: component1, reason: from getter */
            public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto getState() {
                return this.state;
            }

            public final Markdown copy(GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new Markdown(state);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Markdown) && Intrinsics.areEqual(this.state, ((Markdown) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return "Markdown(state=" + this.state + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Markdown(GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto state) {
                super(null);
                Intrinsics.checkNotNullParameter(state, "state");
                this.state = state;
            }

            public final GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.SignableAgreementDto.AgreementContentSectionDto.MarkdownDto getState() {
                return this.state;
            }
        }
    }
}
