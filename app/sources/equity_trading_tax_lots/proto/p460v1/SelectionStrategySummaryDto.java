package equity_trading_tax_lots.proto.p460v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import equity_trading_tax_lots.proto.p460v1.FailureReasonDto;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummaryDto;
import equity_trading_tax_lots.proto.p460v1.WarningsDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: SelectionStrategySummaryDto.kt */
@Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u001fH\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)¨\u0006."}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto;", "Lcom/robinhood/idl/MessageDto;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "Landroid/os/Parcelable;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;", "surrogate", "<init>", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;)V", "", "selected", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "failure_reason", "", "Lequity_trading_tax_lots/proto/v1/WarningsDto;", "warnings", "Lcom/robinhood/idl/IdlDecimal;", "maximum_quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "estimated_gain_loss", "(ZLequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "toProto", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class SelectionStrategySummaryDto implements Dto3<SelectionStrategySummary>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SelectionStrategySummaryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SelectionStrategySummaryDto, SelectionStrategySummary>> binaryBase64Serializer$delegate;
    private static final SelectionStrategySummaryDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SelectionStrategySummaryDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SelectionStrategySummaryDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ SelectionStrategySummaryDto(boolean r2, equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto r3, equity_trading_tax_lots.proto.p460v1.FailureReasonDto r4, java.util.List r5, com.robinhood.idl.IdlDecimal r6, com.robinhood.rosetta.common.MoneyDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lf
            equity_trading_tax_lots.proto.v1.SelectionStrategyDto$Companion r3 = equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto.INSTANCE
            equity_trading_tax_lots.proto.v1.SelectionStrategyDto r3 = r3.getZeroValue()
        Lf:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L15
            r4 = r0
        L15:
            r9 = r8 & 8
            if (r9 == 0) goto L1d
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L1d:
            r9 = r8 & 16
            if (r9 == 0) goto L28
            com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
            java.lang.String r9 = ""
            r6.<init>(r9)
        L28:
            r8 = r8 & 32
            if (r8 == 0) goto L34
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L3b
        L34:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.SelectionStrategySummaryDto.<init>(boolean, equity_trading_tax_lots.proto.v1.SelectionStrategyDto, equity_trading_tax_lots.proto.v1.FailureReasonDto, java.util.List, com.robinhood.idl.IdlDecimal, com.robinhood.rosetta.common.MoneyDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionStrategySummaryDto(boolean z, SelectionStrategyDto selection_strategy, FailureReasonDto failureReasonDto, List<? extends WarningsDto> warnings, IdlDecimal maximum_quantity, MoneyDto moneyDto) {
        this(new Surrogate(z, selection_strategy, failureReasonDto, warnings, maximum_quantity, moneyDto));
        Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SelectionStrategySummary toProto() {
        boolean selected = this.surrogate.getSelected();
        SelectionStrategy selectionStrategy = (SelectionStrategy) this.surrogate.getSelection_strategy().toProto();
        FailureReasonDto failure_reason = this.surrogate.getFailure_reason();
        FailureReason failureReason = failure_reason != null ? (FailureReason) failure_reason.toProto() : null;
        List<WarningsDto> warnings = this.surrogate.getWarnings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
        Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            arrayList.add((Warnings) ((WarningsDto) it.next()).toProto());
        }
        String stringValue = this.surrogate.getMaximum_quantity().getStringValue();
        MoneyDto estimated_gain_loss = this.surrogate.getEstimated_gain_loss();
        return new SelectionStrategySummary(selected, selectionStrategy, failureReason, arrayList, stringValue, estimated_gain_loss != null ? estimated_gain_loss.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[SelectionStrategySummaryDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SelectionStrategySummaryDto) && Intrinsics.areEqual(((SelectionStrategySummaryDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SelectionStrategySummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DCB\\\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B[\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R/\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010A¨\u0006E"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;", "", "", "selected", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "selection_strategy", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "failure_reason", "", "Lequity_trading_tax_lots/proto/v1/WarningsDto;", "warnings", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "maximum_quantity", "Lcom/robinhood/rosetta/common/MoneyDto;", "estimated_gain_loss", "<init>", "(ZLequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLequity_trading_tax_lots/proto/v1/SelectionStrategyDto;Lequity_trading_tax_lots/proto/v1/FailureReasonDto;Ljava/util/List;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/rosetta/common/MoneyDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$equity_trading_tax_lots_proto_v1_externalRelease", "(Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSelected", "()Z", "getSelected$annotations", "()V", "Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategyDto;", "getSelection_strategy$annotations", "Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "getFailure_reason", "()Lequity_trading_tax_lots/proto/v1/FailureReasonDto;", "getFailure_reason$annotations", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "getWarnings$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getMaximum_quantity", "()Lcom/robinhood/idl/IdlDecimal;", "getMaximum_quantity$annotations", "Lcom/robinhood/rosetta/common/MoneyDto;", "getEstimated_gain_loss", "()Lcom/robinhood/rosetta/common/MoneyDto;", "getEstimated_gain_loss$annotations", "Companion", "$serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final MoneyDto estimated_gain_loss;
        private final FailureReasonDto failure_reason;
        private final IdlDecimal maximum_quantity;
        private final boolean selected;
        private final SelectionStrategyDto selection_strategy;
        private final List<WarningsDto> warnings;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategySummaryDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectionStrategySummaryDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this(false, (SelectionStrategyDto) null, (FailureReasonDto) null, (List) null, (IdlDecimal) null, (MoneyDto) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(WarningsDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.selected == surrogate.selected && this.selection_strategy == surrogate.selection_strategy && this.failure_reason == surrogate.failure_reason && Intrinsics.areEqual(this.warnings, surrogate.warnings) && Intrinsics.areEqual(this.maximum_quantity, surrogate.maximum_quantity) && Intrinsics.areEqual(this.estimated_gain_loss, surrogate.estimated_gain_loss);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.selected) * 31) + this.selection_strategy.hashCode()) * 31;
            FailureReasonDto failureReasonDto = this.failure_reason;
            int iHashCode2 = (((((iHashCode + (failureReasonDto == null ? 0 : failureReasonDto.hashCode())) * 31) + this.warnings.hashCode()) * 31) + this.maximum_quantity.hashCode()) * 31;
            MoneyDto moneyDto = this.estimated_gain_loss;
            return iHashCode2 + (moneyDto != null ? moneyDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(selected=" + this.selected + ", selection_strategy=" + this.selection_strategy + ", failure_reason=" + this.failure_reason + ", warnings=" + this.warnings + ", maximum_quantity=" + this.maximum_quantity + ", estimated_gain_loss=" + this.estimated_gain_loss + ")";
        }

        /* compiled from: SelectionStrategySummaryDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SelectionStrategySummaryDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, SelectionStrategyDto selectionStrategyDto, FailureReasonDto failureReasonDto, List list, IdlDecimal idlDecimal, MoneyDto moneyDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.selected = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.selection_strategy = SelectionStrategyDto.INSTANCE.getZeroValue();
            } else {
                this.selection_strategy = selectionStrategyDto;
            }
            if ((i & 4) == 0) {
                this.failure_reason = null;
            } else {
                this.failure_reason = failureReasonDto;
            }
            if ((i & 8) == 0) {
                this.warnings = CollectionsKt.emptyList();
            } else {
                this.warnings = list;
            }
            if ((i & 16) == 0) {
                this.maximum_quantity = new IdlDecimal("");
            } else {
                this.maximum_quantity = idlDecimal;
            }
            if ((i & 32) == 0) {
                this.estimated_gain_loss = null;
            } else {
                this.estimated_gain_loss = moneyDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$equity_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            boolean z = self.selected;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (self.selection_strategy != SelectionStrategyDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, SelectionStrategyDto.Serializer.INSTANCE, self.selection_strategy);
            }
            FailureReasonDto failureReasonDto = self.failure_reason;
            if (failureReasonDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, FailureReasonDto.Serializer.INSTANCE, failureReasonDto);
            }
            if (!Intrinsics.areEqual(self.warnings, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.warnings);
            }
            if (!Intrinsics.areEqual(self.maximum_quantity, new IdlDecimal(""))) {
                output.encodeSerializableElement(serialDesc, 4, IdlDecimalSerializer.INSTANCE, self.maximum_quantity);
            }
            MoneyDto moneyDto = self.estimated_gain_loss;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(boolean z, SelectionStrategyDto selection_strategy, FailureReasonDto failureReasonDto, List<? extends WarningsDto> warnings, IdlDecimal maximum_quantity, MoneyDto moneyDto) {
            Intrinsics.checkNotNullParameter(selection_strategy, "selection_strategy");
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            Intrinsics.checkNotNullParameter(maximum_quantity, "maximum_quantity");
            this.selected = z;
            this.selection_strategy = selection_strategy;
            this.failure_reason = failureReasonDto;
            this.warnings = warnings;
            this.maximum_quantity = maximum_quantity;
            this.estimated_gain_loss = moneyDto;
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final SelectionStrategyDto getSelection_strategy() {
            return this.selection_strategy;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(boolean r2, equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto r3, equity_trading_tax_lots.proto.p460v1.FailureReasonDto r4, java.util.List r5, com.robinhood.idl.IdlDecimal r6, com.robinhood.rosetta.common.MoneyDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 2
                if (r9 == 0) goto Lf
                equity_trading_tax_lots.proto.v1.SelectionStrategyDto$Companion r3 = equity_trading_tax_lots.proto.p460v1.SelectionStrategyDto.INSTANCE
                equity_trading_tax_lots.proto.v1.SelectionStrategyDto r3 = r3.getZeroValue()
            Lf:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L15
                r4 = r0
            L15:
                r9 = r8 & 8
                if (r9 == 0) goto L1d
                java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            L1d:
                r9 = r8 & 16
                if (r9 == 0) goto L28
                com.robinhood.idl.IdlDecimal r6 = new com.robinhood.idl.IdlDecimal
                java.lang.String r9 = ""
                r6.<init>(r9)
            L28:
                r8 = r8 & 32
                if (r8 == 0) goto L34
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L3b
            L34:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: equity_trading_tax_lots.proto.p460v1.SelectionStrategySummaryDto.Surrogate.<init>(boolean, equity_trading_tax_lots.proto.v1.SelectionStrategyDto, equity_trading_tax_lots.proto.v1.FailureReasonDto, java.util.List, com.robinhood.idl.IdlDecimal, com.robinhood.rosetta.common.MoneyDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final FailureReasonDto getFailure_reason() {
            return this.failure_reason;
        }

        public final List<WarningsDto> getWarnings() {
            return this.warnings;
        }

        public final IdlDecimal getMaximum_quantity() {
            return this.maximum_quantity;
        }

        public final MoneyDto getEstimated_gain_loss() {
            return this.estimated_gain_loss;
        }
    }

    /* compiled from: SelectionStrategySummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummary;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SelectionStrategySummaryDto, SelectionStrategySummary> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SelectionStrategySummaryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelectionStrategySummaryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SelectionStrategySummaryDto> getBinaryBase64Serializer() {
            return (KSerializer) SelectionStrategySummaryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SelectionStrategySummary> getProtoAdapter() {
            return SelectionStrategySummary.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelectionStrategySummaryDto getZeroValue() {
            return SelectionStrategySummaryDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SelectionStrategySummaryDto fromProto(SelectionStrategySummary proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean selected = proto.getSelected();
            SelectionStrategyDto selectionStrategyDtoFromProto = SelectionStrategyDto.INSTANCE.fromProto(proto.getSelection_strategy());
            FailureReason failure_reason = proto.getFailure_reason();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FailureReasonDto failureReasonDtoFromProto = failure_reason != null ? FailureReasonDto.INSTANCE.fromProto(failure_reason) : null;
            List<Warnings> warnings = proto.getWarnings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
            Iterator<T> it = warnings.iterator();
            while (it.hasNext()) {
                arrayList.add(WarningsDto.INSTANCE.fromProto((Warnings) it.next()));
            }
            IdlDecimal idlDecimal = new IdlDecimal(proto.getMaximum_quantity());
            Money estimated_gain_loss = proto.getEstimated_gain_loss();
            return new SelectionStrategySummaryDto(new Surrogate(selected, selectionStrategyDtoFromProto, failureReasonDtoFromProto, arrayList, idlDecimal, estimated_gain_loss != null ? MoneyDto.INSTANCE.fromProto(estimated_gain_loss) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: equity_trading_tax_lots.proto.v1.SelectionStrategySummaryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelectionStrategySummaryDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new SelectionStrategySummaryDto(false, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SelectionStrategySummaryDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto;", "<init>", "()V", "surrogateSerializer", "Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SelectionStrategySummaryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/equity_trading_tax_lots.proto.v1.SelectionStrategySummary", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SelectionStrategySummaryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SelectionStrategySummaryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SelectionStrategySummaryDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SelectionStrategySummaryDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/SelectionStrategySummaryDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "equity_trading_tax_lots.proto.v1.SelectionStrategySummaryDto";
        }
    }
}
