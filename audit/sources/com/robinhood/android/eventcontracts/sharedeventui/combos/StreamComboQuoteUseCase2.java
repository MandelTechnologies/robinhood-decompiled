package com.robinhood.android.eventcontracts.sharedeventui.combos;

import com.robinhood.android.eventcontracts.models.event.ContractIdWithSide;
import com.robinhood.store.event.EventComboStore;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamComboQuoteUseCase.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0004\u0005J\b\u0010\u0002\u001a\u00020\u0003H\u0016\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;", "", "toComboInstrument", "Lcom/robinhood/store/event/EventComboStore$ComboInstrument;", "Selections", "ComboInstrument", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$ComboInstrument;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$Selections;", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteRequest, reason: use source file name */
/* loaded from: classes3.dex */
public interface StreamComboQuoteUseCase2 {
    EventComboStore.ComboInstrument toComboInstrument();

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$Selections;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;", "contractIdWithSides", "", "Lcom/robinhood/android/eventcontracts/models/event/ContractIdWithSide;", "<init>", "(Ljava/util/List;)V", "getContractIdWithSides", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteRequest$Selections, reason: from toString */
    public static final /* data */ class Selections implements StreamComboQuoteUseCase2 {
        public static final int $stable = 8;
        private final List<ContractIdWithSide> contractIdWithSides;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Selections copy$default(Selections selections, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = selections.contractIdWithSides;
            }
            return selections.copy(list);
        }

        public final List<ContractIdWithSide> component1() {
            return this.contractIdWithSides;
        }

        public final Selections copy(List<ContractIdWithSide> contractIdWithSides) {
            Intrinsics.checkNotNullParameter(contractIdWithSides, "contractIdWithSides");
            return new Selections(contractIdWithSides);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selections) && Intrinsics.areEqual(this.contractIdWithSides, ((Selections) other).contractIdWithSides);
        }

        public int hashCode() {
            return this.contractIdWithSides.hashCode();
        }

        public String toString() {
            return "Selections(contractIdWithSides=" + this.contractIdWithSides + ")";
        }

        public Selections(List<ContractIdWithSide> contractIdWithSides) {
            Intrinsics.checkNotNullParameter(contractIdWithSides, "contractIdWithSides");
            this.contractIdWithSides = contractIdWithSides;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2
        public EventComboStore.ComboInstrument toComboInstrument() {
            return DefaultImpls.toComboInstrument(this);
        }

        public final List<ContractIdWithSide> getContractIdWithSides() {
            return this.contractIdWithSides;
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest$ComboInstrument;", "Lcom/robinhood/android/eventcontracts/sharedeventui/combos/ComboQuoteRequest;", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteRequest$ComboInstrument, reason: from toString */
    public static final /* data */ class ComboInstrument implements StreamComboQuoteUseCase2 {
        public static final int $stable = 8;
        private final UUID id;

        public static /* synthetic */ ComboInstrument copy$default(ComboInstrument comboInstrument, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = comboInstrument.id;
            }
            return comboInstrument.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final ComboInstrument copy(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new ComboInstrument(id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ComboInstrument) && Intrinsics.areEqual(this.id, ((ComboInstrument) other).id);
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public String toString() {
            return "ComboInstrument(id=" + this.id + ")";
        }

        public ComboInstrument(UUID id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
        }

        @Override // com.robinhood.android.eventcontracts.sharedeventui.combos.StreamComboQuoteUseCase2
        public EventComboStore.ComboInstrument toComboInstrument() {
            return DefaultImpls.toComboInstrument(this);
        }

        public final UUID getId() {
            return this.id;
        }
    }

    /* compiled from: StreamComboQuoteUseCase.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.eventcontracts.sharedeventui.combos.ComboQuoteRequest$DefaultImpls */
    public static final class DefaultImpls {
        public static EventComboStore.ComboInstrument toComboInstrument(StreamComboQuoteUseCase2 streamComboQuoteUseCase2) {
            if (streamComboQuoteUseCase2 instanceof Selections) {
                return new EventComboStore.ComboInstrument.ComboLegs(((Selections) streamComboQuoteUseCase2).getContractIdWithSides());
            }
            if (streamComboQuoteUseCase2 instanceof ComboInstrument) {
                return new EventComboStore.ComboInstrument.ComboInstrumentId(((ComboInstrument) streamComboQuoteUseCase2).getId());
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
