package com.robinhood.shared.crypto.p375ui.trade.confirmation;

import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderConfirmationRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoConfirmationScreenComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006."}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/confirmation/CryptoConfirmationState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderConfirmationRowState;", "primaryBtnText", "secondaryBtnText", "primaryBtnLoading", "", "tertiaryBtnText", "titleAutomationTestTag", "", "secondaryBtnTextAutomationTestTag", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getPrimaryBtnText", "getSecondaryBtnText", "getPrimaryBtnLoading", "()Z", "getTertiaryBtnText", "getTitleAutomationTestTag", "()Ljava/lang/String;", "getSecondaryBtnTextAutomationTestTag", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoConfirmationState {
    public static final int $stable;
    private final boolean primaryBtnLoading;
    private final StringResource primaryBtnText;
    private final ImmutableList<CryptoOrderConfirmationRowState> rows;
    private final StringResource secondaryBtnText;
    private final String secondaryBtnTextAutomationTestTag;
    private final StringResource subtitle;
    private final StringResource tertiaryBtnText;
    private final StringResource title;
    private final String titleAutomationTestTag;

    static {
        int i = StringResource.$stable;
        int i2 = BentoIcon4.$stable;
        $stable = i | i2 | i | i2 | i | i2 | i | i2 | i | i | i;
    }

    public static /* synthetic */ CryptoConfirmationState copy$default(CryptoConfirmationState cryptoConfirmationState, StringResource stringResource, StringResource stringResource2, ImmutableList immutableList, StringResource stringResource3, StringResource stringResource4, boolean z, StringResource stringResource5, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = cryptoConfirmationState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = cryptoConfirmationState.subtitle;
        }
        if ((i & 4) != 0) {
            immutableList = cryptoConfirmationState.rows;
        }
        if ((i & 8) != 0) {
            stringResource3 = cryptoConfirmationState.primaryBtnText;
        }
        if ((i & 16) != 0) {
            stringResource4 = cryptoConfirmationState.secondaryBtnText;
        }
        if ((i & 32) != 0) {
            z = cryptoConfirmationState.primaryBtnLoading;
        }
        if ((i & 64) != 0) {
            stringResource5 = cryptoConfirmationState.tertiaryBtnText;
        }
        if ((i & 128) != 0) {
            str = cryptoConfirmationState.titleAutomationTestTag;
        }
        if ((i & 256) != 0) {
            str2 = cryptoConfirmationState.secondaryBtnTextAutomationTestTag;
        }
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        StringResource stringResource6 = stringResource5;
        StringResource stringResource7 = stringResource4;
        ImmutableList immutableList2 = immutableList;
        return cryptoConfirmationState.copy(stringResource, stringResource2, immutableList2, stringResource3, stringResource7, z2, stringResource6, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<CryptoOrderConfirmationRowState> component3() {
        return this.rows;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getPrimaryBtnText() {
        return this.primaryBtnText;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSecondaryBtnText() {
        return this.secondaryBtnText;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPrimaryBtnLoading() {
        return this.primaryBtnLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final StringResource getTertiaryBtnText() {
        return this.tertiaryBtnText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitleAutomationTestTag() {
        return this.titleAutomationTestTag;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSecondaryBtnTextAutomationTestTag() {
        return this.secondaryBtnTextAutomationTestTag;
    }

    public final CryptoConfirmationState copy(StringResource title, StringResource subtitle, ImmutableList<CryptoOrderConfirmationRowState> rows, StringResource primaryBtnText, StringResource secondaryBtnText, boolean primaryBtnLoading, StringResource tertiaryBtnText, String titleAutomationTestTag, String secondaryBtnTextAutomationTestTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primaryBtnText, "primaryBtnText");
        return new CryptoConfirmationState(title, subtitle, rows, primaryBtnText, secondaryBtnText, primaryBtnLoading, tertiaryBtnText, titleAutomationTestTag, secondaryBtnTextAutomationTestTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoConfirmationState)) {
            return false;
        }
        CryptoConfirmationState cryptoConfirmationState = (CryptoConfirmationState) other;
        return Intrinsics.areEqual(this.title, cryptoConfirmationState.title) && Intrinsics.areEqual(this.subtitle, cryptoConfirmationState.subtitle) && Intrinsics.areEqual(this.rows, cryptoConfirmationState.rows) && Intrinsics.areEqual(this.primaryBtnText, cryptoConfirmationState.primaryBtnText) && Intrinsics.areEqual(this.secondaryBtnText, cryptoConfirmationState.secondaryBtnText) && this.primaryBtnLoading == cryptoConfirmationState.primaryBtnLoading && Intrinsics.areEqual(this.tertiaryBtnText, cryptoConfirmationState.tertiaryBtnText) && Intrinsics.areEqual(this.titleAutomationTestTag, cryptoConfirmationState.titleAutomationTestTag) && Intrinsics.areEqual(this.secondaryBtnTextAutomationTestTag, cryptoConfirmationState.secondaryBtnTextAutomationTestTag);
    }

    public int hashCode() {
        int iHashCode = ((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.rows.hashCode()) * 31) + this.primaryBtnText.hashCode()) * 31;
        StringResource stringResource = this.secondaryBtnText;
        int iHashCode2 = (((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.primaryBtnLoading)) * 31;
        StringResource stringResource2 = this.tertiaryBtnText;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        String str = this.titleAutomationTestTag;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secondaryBtnTextAutomationTestTag;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoConfirmationState(title=" + this.title + ", subtitle=" + this.subtitle + ", rows=" + this.rows + ", primaryBtnText=" + this.primaryBtnText + ", secondaryBtnText=" + this.secondaryBtnText + ", primaryBtnLoading=" + this.primaryBtnLoading + ", tertiaryBtnText=" + this.tertiaryBtnText + ", titleAutomationTestTag=" + this.titleAutomationTestTag + ", secondaryBtnTextAutomationTestTag=" + this.secondaryBtnTextAutomationTestTag + ")";
    }

    public CryptoConfirmationState(StringResource title, StringResource subtitle, ImmutableList<CryptoOrderConfirmationRowState> rows, StringResource primaryBtnText, StringResource stringResource, boolean z, StringResource stringResource2, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(primaryBtnText, "primaryBtnText");
        this.title = title;
        this.subtitle = subtitle;
        this.rows = rows;
        this.primaryBtnText = primaryBtnText;
        this.secondaryBtnText = stringResource;
        this.primaryBtnLoading = z;
        this.tertiaryBtnText = stringResource2;
        this.titleAutomationTestTag = str;
        this.secondaryBtnTextAutomationTestTag = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CryptoConfirmationState(com.robinhood.utils.resource.StringResource r13, com.robinhood.utils.resource.StringResource r14, kotlinx.collections.immutable.ImmutableList r15, com.robinhood.utils.resource.StringResource r16, com.robinhood.utils.resource.StringResource r17, boolean r18, com.robinhood.utils.resource.StringResource r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 0
            r8 = r1
            goto Lb
        L9:
            r8 = r18
        Lb:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r19
        L14:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L1a
            r10 = r2
            goto L1c
        L1a:
            r10 = r20
        L1c:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2a
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2 = r12
            goto L34
        L2a:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
        L34:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.p375ui.trade.confirmation.CryptoConfirmationState.<init>(com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, kotlinx.collections.immutable.ImmutableList, com.robinhood.utils.resource.StringResource, com.robinhood.utils.resource.StringResource, boolean, com.robinhood.utils.resource.StringResource, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<CryptoOrderConfirmationRowState> getRows() {
        return this.rows;
    }

    public final StringResource getPrimaryBtnText() {
        return this.primaryBtnText;
    }

    public final StringResource getSecondaryBtnText() {
        return this.secondaryBtnText;
    }

    public final boolean getPrimaryBtnLoading() {
        return this.primaryBtnLoading;
    }

    public final StringResource getTertiaryBtnText() {
        return this.tertiaryBtnText;
    }

    public final String getTitleAutomationTestTag() {
        return this.titleAutomationTestTag;
    }

    public final String getSecondaryBtnTextAutomationTestTag() {
        return this.secondaryBtnTextAutomationTestTag;
    }
}
