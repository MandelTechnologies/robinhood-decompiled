package com.robinhood.android.acatsin.partials.equity;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInPartialEquityAssetViewState.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fHÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010*J\t\u0010@\u001a\u00020\nHÆ\u0003J\u0096\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0015\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\n2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\fHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010+\u001a\u0004\b\u0014\u0010*R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010-\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b.\u0010\u001fR\u0011\u0010/\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001fR\u0011\u00101\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b2\u0010\u001fR\u0011\u00103\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b4\u0010\u001e¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;", "", "instrumentId", "Ljava/util/UUID;", "symbol", "", "name", "assetToModify", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "isAllSharesChecked", "", "amount", "", "amountText", "populateEditUiEvent", "Lcom/robinhood/udf/UiEvent;", "selectedPosition", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "borrowFee", "Ljava/math/BigDecimal;", "isShortPositionAvailable", "inSubzeroExperiment", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;ZLjava/lang/Integer;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/math/BigDecimal;Ljava/lang/Boolean;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getName", "getAssetToModify", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;", "()Z", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAmountText", "getPopulateEditUiEvent", "()Lcom/robinhood/udf/UiEvent;", "getSelectedPosition", "()Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;", "getBorrowFee", "()Ljava/math/BigDecimal;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInSubzeroExperiment", "showAmountEntryUi", "getShowAmountEntryUi", "enableAddToListButton", "getEnableAddToListButton", "enableShortPositionButton", "getEnableShortPositionButton", "asset", "getAsset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$EquityAsset;ZLjava/lang/Integer;Ljava/lang/String;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$Direction;Ljava/math/BigDecimal;Ljava/lang/Boolean;Z)Lcom/robinhood/android/acatsin/partials/equity/AcatsInPartialEquityAssetViewState;", "equals", "other", "hashCode", "toString", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class AcatsInPartialEquityAssetViewState {
    public static final int $stable = 8;
    private final Integer amount;
    private final String amountText;
    private final UiAcatsAsset.EquityAsset assetToModify;
    private final BigDecimal borrowFee;
    private final boolean inSubzeroExperiment;
    private final UUID instrumentId;
    private final boolean isAllSharesChecked;
    private final Boolean isShortPositionAvailable;
    private final String name;
    private final UiEvent<UiAcatsAsset.EquityAsset> populateEditUiEvent;
    private final ApiAcatsTransfer.Asset.Direction selectedPosition;
    private final String symbol;

    public static /* synthetic */ AcatsInPartialEquityAssetViewState copy$default(AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState, UUID uuid, String str, String str2, UiAcatsAsset.EquityAsset equityAsset, boolean z, Integer num, String str3, UiEvent uiEvent, ApiAcatsTransfer.Asset.Direction direction, BigDecimal bigDecimal, Boolean bool, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = acatsInPartialEquityAssetViewState.instrumentId;
        }
        if ((i & 2) != 0) {
            str = acatsInPartialEquityAssetViewState.symbol;
        }
        if ((i & 4) != 0) {
            str2 = acatsInPartialEquityAssetViewState.name;
        }
        if ((i & 8) != 0) {
            equityAsset = acatsInPartialEquityAssetViewState.assetToModify;
        }
        if ((i & 16) != 0) {
            z = acatsInPartialEquityAssetViewState.isAllSharesChecked;
        }
        if ((i & 32) != 0) {
            num = acatsInPartialEquityAssetViewState.amount;
        }
        if ((i & 64) != 0) {
            str3 = acatsInPartialEquityAssetViewState.amountText;
        }
        if ((i & 128) != 0) {
            uiEvent = acatsInPartialEquityAssetViewState.populateEditUiEvent;
        }
        if ((i & 256) != 0) {
            direction = acatsInPartialEquityAssetViewState.selectedPosition;
        }
        if ((i & 512) != 0) {
            bigDecimal = acatsInPartialEquityAssetViewState.borrowFee;
        }
        if ((i & 1024) != 0) {
            bool = acatsInPartialEquityAssetViewState.isShortPositionAvailable;
        }
        if ((i & 2048) != 0) {
            z2 = acatsInPartialEquityAssetViewState.inSubzeroExperiment;
        }
        Boolean bool2 = bool;
        boolean z3 = z2;
        ApiAcatsTransfer.Asset.Direction direction2 = direction;
        BigDecimal bigDecimal2 = bigDecimal;
        String str4 = str3;
        UiEvent uiEvent2 = uiEvent;
        boolean z4 = z;
        Integer num2 = num;
        return acatsInPartialEquityAssetViewState.copy(uuid, str, str2, equityAsset, z4, num2, str4, uiEvent2, direction2, bigDecimal2, bool2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component10, reason: from getter */
    public final BigDecimal getBorrowFee() {
        return this.borrowFee;
    }

    /* renamed from: component11, reason: from getter */
    public final Boolean getIsShortPositionAvailable() {
        return this.isShortPositionAvailable;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getInSubzeroExperiment() {
        return this.inSubzeroExperiment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final UiAcatsAsset.EquityAsset getAssetToModify() {
        return this.assetToModify;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAllSharesChecked() {
        return this.isAllSharesChecked;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    public final UiEvent<UiAcatsAsset.EquityAsset> component8() {
        return this.populateEditUiEvent;
    }

    /* renamed from: component9, reason: from getter */
    public final ApiAcatsTransfer.Asset.Direction getSelectedPosition() {
        return this.selectedPosition;
    }

    public final AcatsInPartialEquityAssetViewState copy(UUID instrumentId, String symbol, String name, UiAcatsAsset.EquityAsset assetToModify, boolean isAllSharesChecked, Integer amount, String amountText, UiEvent<UiAcatsAsset.EquityAsset> populateEditUiEvent, ApiAcatsTransfer.Asset.Direction selectedPosition, BigDecimal borrowFee, Boolean isShortPositionAvailable, boolean inSubzeroExperiment) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(selectedPosition, "selectedPosition");
        return new AcatsInPartialEquityAssetViewState(instrumentId, symbol, name, assetToModify, isAllSharesChecked, amount, amountText, populateEditUiEvent, selectedPosition, borrowFee, isShortPositionAvailable, inSubzeroExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInPartialEquityAssetViewState)) {
            return false;
        }
        AcatsInPartialEquityAssetViewState acatsInPartialEquityAssetViewState = (AcatsInPartialEquityAssetViewState) other;
        return Intrinsics.areEqual(this.instrumentId, acatsInPartialEquityAssetViewState.instrumentId) && Intrinsics.areEqual(this.symbol, acatsInPartialEquityAssetViewState.symbol) && Intrinsics.areEqual(this.name, acatsInPartialEquityAssetViewState.name) && Intrinsics.areEqual(this.assetToModify, acatsInPartialEquityAssetViewState.assetToModify) && this.isAllSharesChecked == acatsInPartialEquityAssetViewState.isAllSharesChecked && Intrinsics.areEqual(this.amount, acatsInPartialEquityAssetViewState.amount) && Intrinsics.areEqual(this.amountText, acatsInPartialEquityAssetViewState.amountText) && Intrinsics.areEqual(this.populateEditUiEvent, acatsInPartialEquityAssetViewState.populateEditUiEvent) && this.selectedPosition == acatsInPartialEquityAssetViewState.selectedPosition && Intrinsics.areEqual(this.borrowFee, acatsInPartialEquityAssetViewState.borrowFee) && Intrinsics.areEqual(this.isShortPositionAvailable, acatsInPartialEquityAssetViewState.isShortPositionAvailable) && this.inSubzeroExperiment == acatsInPartialEquityAssetViewState.inSubzeroExperiment;
    }

    public int hashCode() {
        int iHashCode = ((((this.instrumentId.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31;
        UiAcatsAsset.EquityAsset equityAsset = this.assetToModify;
        int iHashCode2 = (((iHashCode + (equityAsset == null ? 0 : equityAsset.hashCode())) * 31) + Boolean.hashCode(this.isAllSharesChecked)) * 31;
        Integer num = this.amount;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.amountText.hashCode()) * 31;
        UiEvent<UiAcatsAsset.EquityAsset> uiEvent = this.populateEditUiEvent;
        int iHashCode4 = (((iHashCode3 + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + this.selectedPosition.hashCode()) * 31;
        BigDecimal bigDecimal = this.borrowFee;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.isShortPositionAvailable;
        return ((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + Boolean.hashCode(this.inSubzeroExperiment);
    }

    public String toString() {
        return "AcatsInPartialEquityAssetViewState(instrumentId=" + this.instrumentId + ", symbol=" + this.symbol + ", name=" + this.name + ", assetToModify=" + this.assetToModify + ", isAllSharesChecked=" + this.isAllSharesChecked + ", amount=" + this.amount + ", amountText=" + this.amountText + ", populateEditUiEvent=" + this.populateEditUiEvent + ", selectedPosition=" + this.selectedPosition + ", borrowFee=" + this.borrowFee + ", isShortPositionAvailable=" + this.isShortPositionAvailable + ", inSubzeroExperiment=" + this.inSubzeroExperiment + ")";
    }

    public AcatsInPartialEquityAssetViewState(UUID instrumentId, String symbol, String name, UiAcatsAsset.EquityAsset equityAsset, boolean z, Integer num, String amountText, UiEvent<UiAcatsAsset.EquityAsset> uiEvent, ApiAcatsTransfer.Asset.Direction selectedPosition, BigDecimal bigDecimal, Boolean bool, boolean z2) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(amountText, "amountText");
        Intrinsics.checkNotNullParameter(selectedPosition, "selectedPosition");
        this.instrumentId = instrumentId;
        this.symbol = symbol;
        this.name = name;
        this.assetToModify = equityAsset;
        this.isAllSharesChecked = z;
        this.amount = num;
        this.amountText = amountText;
        this.populateEditUiEvent = uiEvent;
        this.selectedPosition = selectedPosition;
        this.borrowFee = bigDecimal;
        this.isShortPositionAvailable = bool;
        this.inSubzeroExperiment = z2;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getName() {
        return this.name;
    }

    public final UiAcatsAsset.EquityAsset getAssetToModify() {
        return this.assetToModify;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AcatsInPartialEquityAssetViewState(java.util.UUID r14, java.lang.String r15, java.lang.String r16, com.robinhood.android.acatsin.partials.UiAcatsAsset.EquityAsset r17, boolean r18, java.lang.Integer r19, java.lang.String r20, com.robinhood.udf.UiEvent r21, com.robinhood.models.api.bonfire.ApiAcatsTransfer.Asset.Direction r22, java.math.BigDecimal r23, java.lang.Boolean r24, boolean r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r4 = r17
            r0 = r26
            r1 = r0 & 16
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L19
            if (r4 == 0) goto L11
            java.lang.Integer r1 = r4.getNumShares()
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = r2
        L17:
            r5 = r1
            goto L1b
        L19:
            r5 = r18
        L1b:
            r1 = r0 & 32
            if (r1 == 0) goto L29
            if (r4 == 0) goto L26
            java.lang.Integer r1 = r4.getNumShares()
            goto L27
        L26:
            r1 = r3
        L27:
            r6 = r1
            goto L2b
        L29:
            r6 = r19
        L2b:
            r1 = r0 & 64
            if (r1 == 0) goto L33
            java.lang.String r1 = ""
            r7 = r1
            goto L35
        L33:
            r7 = r20
        L35:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L44
            if (r4 == 0) goto L41
            com.robinhood.udf.UiEvent r1 = new com.robinhood.udf.UiEvent
            r1.<init>(r4)
            goto L42
        L41:
            r1 = r3
        L42:
            r8 = r1
            goto L46
        L44:
            r8 = r21
        L46:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L56
            if (r4 == 0) goto L52
            com.robinhood.models.api.bonfire.ApiAcatsTransfer$Asset$Direction r1 = r4.getDirection()
            if (r1 != 0) goto L54
        L52:
            com.robinhood.models.api.bonfire.ApiAcatsTransfer$Asset$Direction r1 = com.robinhood.models.api.bonfire.ApiAcatsTransfer.Asset.Direction.LONG
        L54:
            r9 = r1
            goto L58
        L56:
            r9 = r22
        L58:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L66
            if (r4 == 0) goto L63
            java.math.BigDecimal r1 = r4.getBorrowFee()
            goto L64
        L63:
            r1 = r3
        L64:
            r10 = r1
            goto L68
        L66:
            r10 = r23
        L68:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L6e
            r11 = r3
            goto L70
        L6e:
            r11 = r24
        L70:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L7b
            r12 = r2
            r0 = r13
            r1 = r14
            r3 = r16
            r2 = r15
            goto L82
        L7b:
            r12 = r25
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
        L82:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetViewState.<init>(java.util.UUID, java.lang.String, java.lang.String, com.robinhood.android.acatsin.partials.UiAcatsAsset$EquityAsset, boolean, java.lang.Integer, java.lang.String, com.robinhood.udf.UiEvent, com.robinhood.models.api.bonfire.ApiAcatsTransfer$Asset$Direction, java.math.BigDecimal, java.lang.Boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean isAllSharesChecked() {
        return this.isAllSharesChecked;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final UiEvent<UiAcatsAsset.EquityAsset> getPopulateEditUiEvent() {
        return this.populateEditUiEvent;
    }

    public final ApiAcatsTransfer.Asset.Direction getSelectedPosition() {
        return this.selectedPosition;
    }

    public final BigDecimal getBorrowFee() {
        return this.borrowFee;
    }

    public final Boolean isShortPositionAvailable() {
        return this.isShortPositionAvailable;
    }

    public final boolean getInSubzeroExperiment() {
        return this.inSubzeroExperiment;
    }

    public final boolean getShowAmountEntryUi() {
        return !this.isAllSharesChecked;
    }

    public final boolean getEnableAddToListButton() {
        if (this.isAllSharesChecked) {
            return true;
        }
        Integer num = this.amount;
        return num != null && num.intValue() > 0;
    }

    public final boolean getEnableShortPositionButton() {
        return this.inSubzeroExperiment && Intrinsics.areEqual(this.isShortPositionAvailable, Boolean.TRUE);
    }

    public final UiAcatsAsset.EquityAsset getAsset() {
        Integer num;
        UUID uuid = this.instrumentId;
        String str = this.symbol;
        String str2 = this.name;
        BigDecimal bigDecimal = null;
        if (this.isAllSharesChecked) {
            num = null;
        } else {
            num = this.amount;
            Intrinsics.checkNotNull(num);
        }
        boolean z = this.inSubzeroExperiment;
        ApiAcatsTransfer.Asset.Direction direction = z ? this.selectedPosition : ApiAcatsTransfer.Asset.Direction.LONG;
        if (z && this.selectedPosition == ApiAcatsTransfer.Asset.Direction.SHORT) {
            bigDecimal = this.borrowFee;
        }
        return new UiAcatsAsset.EquityAsset(uuid, str, str2, num, direction, bigDecimal);
    }
}
