package com.robinhood.android.trading.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration;
import com.robinhood.directipo.models.DirectIpoOrderSource;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Order;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityOrderActivityIntentKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0005()*+,Bu\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\u0013\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0014\u0010\u0014\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001e\u0082\u0001\u0005-./01¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "refId", "Ljava/util/UUID;", "instrumentId", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "isPreIpo", "", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "completionUrl", "orderToModify", "Lcom/robinhood/models/db/Order;", "overrideLaunchOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "skipConfirmation", "retainAdvanceChart", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Ljava/lang/String;ZLcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/lang/String;Lcom/robinhood/models/db/Order;Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;ZZ)V", "getRefId", "()Ljava/util/UUID;", "getInstrumentId", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getAccountNumber", "()Ljava/lang/String;", "()Z", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getCompletionUrl", "getOrderToModify", "()Lcom/robinhood/models/db/Order;", "getOverrideLaunchOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "getSkipConfirmation", "getRetainAdvanceChart", "WithId", "ModifyExisting", "ModifyExistingWithConfig", "PreIpo", "DirectIpo", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$DirectIpo;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$ModifyExisting;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$ModifyExistingWithConfig;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$PreIpo;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$WithId;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public abstract class EquityOrderActivityIntentKey implements IntentKey, Parcelable {
    private final String accountNumber;
    private final String completionUrl;
    private final EquityOrderFlowSource flowSource;
    private final UUID instrumentId;
    private final boolean isPreIpo;
    private final Order orderToModify;
    private final EquityOrderConfiguration overrideLaunchOrderConfiguration;
    private final UUID refId;
    private final boolean retainAdvanceChart;
    private final EquityOrderSide side;
    private final boolean skipConfirmation;

    public /* synthetic */ EquityOrderActivityIntentKey(UUID uuid, UUID uuid2, EquityOrderSide equityOrderSide, String str, boolean z, EquityOrderFlowSource equityOrderFlowSource, String str2, Order order, EquityOrderConfiguration equityOrderConfiguration, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, uuid2, equityOrderSide, str, z, equityOrderFlowSource, str2, order, equityOrderConfiguration, z2, z3);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    private EquityOrderActivityIntentKey(UUID uuid, UUID uuid2, EquityOrderSide equityOrderSide, String str, boolean z, EquityOrderFlowSource equityOrderFlowSource, String str2, Order order, EquityOrderConfiguration equityOrderConfiguration, boolean z2, boolean z3) {
        this.refId = uuid;
        this.instrumentId = uuid2;
        this.side = equityOrderSide;
        this.accountNumber = str;
        this.isPreIpo = z;
        this.flowSource = equityOrderFlowSource;
        this.completionUrl = str2;
        this.orderToModify = order;
        this.overrideLaunchOrderConfiguration = equityOrderConfiguration;
        this.skipConfirmation = z2;
        this.retainAdvanceChart = z3;
        Order orderToModify = getOrderToModify();
        boolean z4 = false;
        if (orderToModify != null && !orderToModify.isEditable()) {
            z4 = true;
        }
        if (z4) {
            throw new IllegalStateException("Order to modify must be editable if present");
        }
    }

    public /* synthetic */ EquityOrderActivityIntentKey(UUID uuid, UUID uuid2, EquityOrderSide equityOrderSide, String str, boolean z, EquityOrderFlowSource equityOrderFlowSource, String str2, Order order, EquityOrderConfiguration equityOrderConfiguration, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID() : uuid, uuid2, equityOrderSide, str, z, equityOrderFlowSource, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : order, (i & 256) != 0 ? null : equityOrderConfiguration, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, null);
    }

    public UUID getRefId() {
        return this.refId;
    }

    public UUID getInstrumentId() {
        return this.instrumentId;
    }

    public EquityOrderSide getSide() {
        return this.side;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: isPreIpo, reason: from getter */
    public boolean getIsPreIpo() {
        return this.isPreIpo;
    }

    public EquityOrderFlowSource getFlowSource() {
        return this.flowSource;
    }

    public String getCompletionUrl() {
        return this.completionUrl;
    }

    public Order getOrderToModify() {
        return this.orderToModify;
    }

    public EquityOrderConfiguration getOverrideLaunchOrderConfiguration() {
        return this.overrideLaunchOrderConfiguration;
    }

    public boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    public boolean getRetainAdvanceChart() {
        return this.retainAdvanceChart;
    }

    /* compiled from: EquityOrderActivityIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0010\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$WithId;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "refId", "accountNumber", "", "completionUrl", "overrideLaunchOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "skipConfirmation", "", "retainAdvanceChart", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/EquityOrderSide;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;ZZ)V", "getInstrumentId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/EquityOrderSide;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getRefId", "getAccountNumber", "()Ljava/lang/String;", "getCompletionUrl", "getOverrideLaunchOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/EquityOrderConfiguration;", "getSkipConfirmation", "()Z", "getRetainAdvanceChart", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class WithId extends EquityOrderActivityIntentKey {
        public static final Parcelable.Creator<WithId> CREATOR = new Creator();
        private final String accountNumber;
        private final String completionUrl;
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;
        private final EquityOrderConfiguration overrideLaunchOrderConfiguration;
        private final UUID refId;
        private final boolean retainAdvanceChart;
        private final EquityOrderSide side;
        private final boolean skipConfirmation;

        /* compiled from: EquityOrderActivityIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<WithId> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithId createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                UUID uuid = (UUID) parcel.readSerializable();
                EquityOrderSide equityOrderSideValueOf = EquityOrderSide.valueOf(parcel.readString());
                EquityOrderFlowSource equityOrderFlowSourceValueOf = EquityOrderFlowSource.valueOf(parcel.readString());
                UUID uuid2 = (UUID) parcel.readSerializable();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                EquityOrderConfiguration equityOrderConfiguration = (EquityOrderConfiguration) parcel.readParcelable(WithId.class.getClassLoader());
                boolean z2 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
                return new WithId(uuid, equityOrderSideValueOf, equityOrderFlowSourceValueOf, uuid2, string2, string3, equityOrderConfiguration, z2, parcel.readInt() == 0 ? z : true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WithId[] newArray(int i) {
                return new WithId[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.side.name());
            dest.writeString(this.flowSource.name());
            dest.writeSerializable(this.refId);
            dest.writeString(this.accountNumber);
            dest.writeString(this.completionUrl);
            dest.writeParcelable(this.overrideLaunchOrderConfiguration, flags);
            dest.writeInt(this.skipConfirmation ? 1 : 0);
            dest.writeInt(this.retainAdvanceChart ? 1 : 0);
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderSide getSide() {
            return this.side;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ WithId(java.util.UUID r13, com.robinhood.models.p320db.EquityOrderSide r14, com.robinhood.android.trading.contracts.EquityOrderFlowSource r15, java.util.UUID r16, java.lang.String r17, java.lang.String r18, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration r19, boolean r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
            /*
                r12 = this;
                r0 = r22
                r1 = r0 & 8
                if (r1 == 0) goto Lc
                java.util.UUID r1 = java.util.UUID.randomUUID()
                r6 = r1
                goto Le
            Lc:
                r6 = r16
            Le:
                r1 = r0 & 16
                r2 = 0
                if (r1 == 0) goto L15
                r7 = r2
                goto L17
            L15:
                r7 = r17
            L17:
                r1 = r0 & 32
                if (r1 == 0) goto L1d
                r8 = r2
                goto L1f
            L1d:
                r8 = r18
            L1f:
                r1 = r0 & 64
                if (r1 == 0) goto L25
                r9 = r2
                goto L27
            L25:
                r9 = r19
            L27:
                r1 = r0 & 128(0x80, float:1.794E-43)
                r2 = 0
                if (r1 == 0) goto L2e
                r10 = r2
                goto L30
            L2e:
                r10 = r20
            L30:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L3a
                r11 = r2
                r3 = r13
                r4 = r14
                r5 = r15
                r2 = r12
                goto L40
            L3a:
                r11 = r21
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
            L40:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey.WithId.<init>(java.util.UUID, com.robinhood.models.db.EquityOrderSide, com.robinhood.android.trading.contracts.EquityOrderFlowSource, java.util.UUID, java.lang.String, java.lang.String, com.robinhood.android.trading.contracts.configuration.EquityOrderConfiguration, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public UUID getRefId() {
            return this.refId;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public String getCompletionUrl() {
            return this.completionUrl;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderConfiguration getOverrideLaunchOrderConfiguration() {
            return this.overrideLaunchOrderConfiguration;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public boolean getSkipConfirmation() {
            return this.skipConfirmation;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public boolean getRetainAdvanceChart() {
            return this.retainAdvanceChart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithId(UUID instrumentId, EquityOrderSide side, EquityOrderFlowSource flowSource, UUID refId, String str, String str2, EquityOrderConfiguration equityOrderConfiguration, boolean z, boolean z2) {
            super(refId, instrumentId, side, str, false, flowSource, str2, null, equityOrderConfiguration, z, z2, 128, null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.instrumentId = instrumentId;
            this.side = side;
            this.flowSource = flowSource;
            this.refId = refId;
            this.accountNumber = str;
            this.completionUrl = str2;
            this.overrideLaunchOrderConfiguration = equityOrderConfiguration;
            this.skipConfirmation = z;
            this.retainAdvanceChart = z2;
        }
    }

    /* compiled from: EquityOrderActivityIntentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$ModifyExisting;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "orderToModify", "Lcom/robinhood/models/db/Order;", "isPreIpo", "", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "<init>", "(Lcom/robinhood/models/db/Order;ZLcom/robinhood/android/trading/contracts/EquityOrderFlowSource;)V", "getOrderToModify", "()Lcom/robinhood/models/db/Order;", "()Z", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ModifyExisting extends EquityOrderActivityIntentKey {
        public static final Parcelable.Creator<ModifyExisting> CREATOR = new Creator();
        private final EquityOrderFlowSource flowSource;
        private final boolean isPreIpo;
        private final Order orderToModify;

        /* compiled from: EquityOrderActivityIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<ModifyExisting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ModifyExisting createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ModifyExisting((Order) parcel.readParcelable(ModifyExisting.class.getClassLoader()), parcel.readInt() != 0, EquityOrderFlowSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ModifyExisting[] newArray(int i) {
                return new ModifyExisting[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.orderToModify, flags);
            dest.writeInt(this.isPreIpo ? 1 : 0);
            dest.writeString(this.flowSource.name());
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public Order getOrderToModify() {
            return this.orderToModify;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        /* renamed from: isPreIpo, reason: from getter */
        public boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModifyExisting(Order orderToModify, boolean z, EquityOrderFlowSource flowSource) {
            super(null, orderToModify.getInstrument(), orderToModify.getSide(), orderToModify.getAccountNumber(), z, flowSource, null, null, null, false, false, 1729, null);
            Intrinsics.checkNotNullParameter(orderToModify, "orderToModify");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.orderToModify = orderToModify;
            this.isPreIpo = z;
            this.flowSource = flowSource;
        }
    }

    /* compiled from: EquityOrderActivityIntentKey.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\r\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$ModifyExistingWithConfig;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "overrideLaunchOrderConfiguration", "Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "orderToModify", "Lcom/robinhood/models/db/Order;", "isPreIpo", "", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "refId", "Ljava/util/UUID;", "skipConfirmation", "retainAdvanceChart", "<init>", "(Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;Lcom/robinhood/models/db/Order;ZLcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/util/UUID;ZZ)V", "getOverrideLaunchOrderConfiguration", "()Lcom/robinhood/android/trading/contracts/configuration/DirectOrder;", "getOrderToModify", "()Lcom/robinhood/models/db/Order;", "()Z", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getRefId", "()Ljava/util/UUID;", "getSkipConfirmation", "getRetainAdvanceChart", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class ModifyExistingWithConfig extends EquityOrderActivityIntentKey {
        public static final Parcelable.Creator<ModifyExistingWithConfig> CREATOR = new Creator();
        private final EquityOrderFlowSource flowSource;
        private final boolean isPreIpo;
        private final Order orderToModify;
        private final DirectOrder overrideLaunchOrderConfiguration;
        private final UUID refId;
        private final boolean retainAdvanceChart;
        private final boolean skipConfirmation;

        /* compiled from: EquityOrderActivityIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<ModifyExistingWithConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ModifyExistingWithConfig createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                EquityOrderFlowSource equityOrderFlowSource;
                UUID uuid;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                DirectOrder directOrder = (DirectOrder) parcel.readParcelable(ModifyExistingWithConfig.class.getClassLoader());
                Order order = (Order) parcel.readParcelable(ModifyExistingWithConfig.class.getClassLoader());
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                EquityOrderFlowSource equityOrderFlowSourceValueOf = EquityOrderFlowSource.valueOf(parcel.readString());
                UUID uuid2 = (UUID) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z2 = true;
                    equityOrderFlowSource = equityOrderFlowSourceValueOf;
                    uuid = uuid2;
                    z3 = true;
                } else {
                    z2 = true;
                    equityOrderFlowSource = equityOrderFlowSourceValueOf;
                    uuid = uuid2;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z2 = z;
                }
                return new ModifyExistingWithConfig(directOrder, order, z4, equityOrderFlowSource, uuid, z3, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ModifyExistingWithConfig[] newArray(int i) {
                return new ModifyExistingWithConfig[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.overrideLaunchOrderConfiguration, flags);
            dest.writeParcelable(this.orderToModify, flags);
            dest.writeInt(this.isPreIpo ? 1 : 0);
            dest.writeString(this.flowSource.name());
            dest.writeSerializable(this.refId);
            dest.writeInt(this.skipConfirmation ? 1 : 0);
            dest.writeInt(this.retainAdvanceChart ? 1 : 0);
        }

        public /* synthetic */ ModifyExistingWithConfig(DirectOrder directOrder, Order order, boolean z, EquityOrderFlowSource equityOrderFlowSource, UUID uuid, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(directOrder, order, z, equityOrderFlowSource, uuid, (i & 32) != 0 ? false : z2, z3);
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public DirectOrder getOverrideLaunchOrderConfiguration() {
            return this.overrideLaunchOrderConfiguration;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public Order getOrderToModify() {
            return this.orderToModify;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        /* renamed from: isPreIpo, reason: from getter */
        public boolean getIsPreIpo() {
            return this.isPreIpo;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public UUID getRefId() {
            return this.refId;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public boolean getSkipConfirmation() {
            return this.skipConfirmation;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public boolean getRetainAdvanceChart() {
            return this.retainAdvanceChart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ModifyExistingWithConfig(DirectOrder overrideLaunchOrderConfiguration, Order orderToModify, boolean z, EquityOrderFlowSource flowSource, UUID refId, boolean z2, boolean z3) {
            super(refId, orderToModify.getInstrument(), orderToModify.getSide(), orderToModify.getAccountNumber(), z, flowSource, null, null, overrideLaunchOrderConfiguration, z2, z3, 192, null);
            Intrinsics.checkNotNullParameter(overrideLaunchOrderConfiguration, "overrideLaunchOrderConfiguration");
            Intrinsics.checkNotNullParameter(orderToModify, "orderToModify");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            Intrinsics.checkNotNullParameter(refId, "refId");
            this.overrideLaunchOrderConfiguration = overrideLaunchOrderConfiguration;
            this.orderToModify = orderToModify;
            this.isPreIpo = z;
            this.flowSource = flowSource;
            this.refId = refId;
            this.skipConfirmation = z2;
            this.retainAdvanceChart = z3;
        }
    }

    /* compiled from: EquityOrderActivityIntentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$PreIpo;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "instrumentId", "Ljava/util/UUID;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "accountNumber", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Ljava/lang/String;)V", "getInstrumentId", "()Ljava/util/UUID;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getAccountNumber", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PreIpo extends EquityOrderActivityIntentKey {
        public static final Parcelable.Creator<PreIpo> CREATOR = new Creator();
        private final String accountNumber;
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;

        /* compiled from: EquityOrderActivityIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<PreIpo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreIpo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreIpo((UUID) parcel.readSerializable(), EquityOrderFlowSource.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreIpo[] newArray(int i) {
                return new PreIpo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.flowSource.name());
            dest.writeString(this.accountNumber);
        }

        public /* synthetic */ PreIpo(UUID uuid, EquityOrderFlowSource equityOrderFlowSource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uuid, equityOrderFlowSource, (i & 4) != 0 ? null : str);
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreIpo(UUID instrumentId, EquityOrderFlowSource flowSource, String str) {
            super(null, instrumentId, EquityOrderSide.BUY, str, true, flowSource, null, null, null, false, false, 1985, null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.instrumentId = instrumentId;
            this.flowSource = flowSource;
            this.accountNumber = str;
        }
    }

    /* compiled from: EquityOrderActivityIntentKey.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey$DirectIpo;", "Lcom/robinhood/android/trading/contracts/EquityOrderActivityIntentKey;", "instrumentId", "Ljava/util/UUID;", "flowSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "source", "Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;Lcom/robinhood/directipo/models/DirectIpoOrderSource;)V", "getInstrumentId", "()Ljava/util/UUID;", "getFlowSource", "()Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "getSource", "()Lcom/robinhood/directipo/models/DirectIpoOrderSource;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DirectIpo extends EquityOrderActivityIntentKey {
        public static final Parcelable.Creator<DirectIpo> CREATOR = new Creator();
        private final EquityOrderFlowSource flowSource;
        private final UUID instrumentId;
        private final DirectIpoOrderSource source;

        /* compiled from: EquityOrderActivityIntentKey.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes9.dex */
        public static final class Creator implements Parcelable.Creator<DirectIpo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectIpo((UUID) parcel.readSerializable(), EquityOrderFlowSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DirectIpoOrderSource.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DirectIpo[] newArray(int i) {
                return new DirectIpo[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.instrumentId);
            dest.writeString(this.flowSource.name());
            DirectIpoOrderSource directIpoOrderSource = this.source;
            if (directIpoOrderSource == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(directIpoOrderSource.name());
            }
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public UUID getInstrumentId() {
            return this.instrumentId;
        }

        @Override // com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey
        public EquityOrderFlowSource getFlowSource() {
            return this.flowSource;
        }

        public final DirectIpoOrderSource getSource() {
            return this.source;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectIpo(UUID instrumentId, EquityOrderFlowSource flowSource, DirectIpoOrderSource directIpoOrderSource) {
            super(null, instrumentId, EquityOrderSide.BUY, null, true, flowSource, null, null, new EquityOrderConfiguration.DirectIpoOrderConfiguration(directIpoOrderSource), false, false, 1729, null);
            Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
            Intrinsics.checkNotNullParameter(flowSource, "flowSource");
            this.instrumentId = instrumentId;
            this.flowSource = flowSource;
            this.source = directIpoOrderSource;
        }
    }
}
