package com.robinhood.android.feature.linking;

import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.store.linking.LinkingGroup;
import com.robinhood.models.p320db.Instrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MobileLinkingHostDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "", "<init>", "()V", "ShowFuturesLadder", "ShowEquitiesLadder", "ShowUnsupportedError", "ShowNoWidgetsError", "ShowNoLinkedGroupError", "ShowNetworkError", "ShowAccountTypeDialog", "TryPlaySound", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowAccountTypeDialog;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowEquitiesLadder;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowFuturesLadder;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNetworkError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNoLinkedGroupError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNoWidgetsError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowUnsupportedError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$TryPlaySound;", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent, reason: use source file name */
/* loaded from: classes3.dex */
public abstract class MobileLinkingHostDuxo8 {
    public static final int $stable = 0;

    public /* synthetic */ MobileLinkingHostDuxo8(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MobileLinkingHostDuxo8() {
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowFuturesLadder;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/store/linking/LinkingGroup;", "contractId", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;Ljava/util/UUID;)V", "getGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "getContractId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowFuturesLadder, reason: from toString */
    public static final /* data */ class ShowFuturesLadder extends MobileLinkingHostDuxo8 {
        public static final int $stable = 8;
        private final UUID contractId;
        private final LinkingGroup group;

        public static /* synthetic */ ShowFuturesLadder copy$default(ShowFuturesLadder showFuturesLadder, LinkingGroup linkingGroup, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                linkingGroup = showFuturesLadder.group;
            }
            if ((i & 2) != 0) {
                uuid = showFuturesLadder.contractId;
            }
            return showFuturesLadder.copy(linkingGroup, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkingGroup getGroup() {
            return this.group;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        public final ShowFuturesLadder copy(LinkingGroup group, UUID contractId) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            return new ShowFuturesLadder(group, contractId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowFuturesLadder)) {
                return false;
            }
            ShowFuturesLadder showFuturesLadder = (ShowFuturesLadder) other;
            return Intrinsics.areEqual(this.group, showFuturesLadder.group) && Intrinsics.areEqual(this.contractId, showFuturesLadder.contractId);
        }

        public int hashCode() {
            return (this.group.hashCode() * 31) + this.contractId.hashCode();
        }

        public String toString() {
            return "ShowFuturesLadder(group=" + this.group + ", contractId=" + this.contractId + ")";
        }

        public final LinkingGroup getGroup() {
            return this.group;
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowFuturesLadder(LinkingGroup group, UUID contractId) {
            super(null);
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            this.group = group;
            this.contractId = contractId;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowEquitiesLadder;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/store/linking/LinkingGroup;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;Lcom/robinhood/models/db/Instrument;)V", "getGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowEquitiesLadder, reason: from toString */
    public static final /* data */ class ShowEquitiesLadder extends MobileLinkingHostDuxo8 {
        public static final int $stable = 8;
        private final LinkingGroup group;
        private final Instrument instrument;

        public static /* synthetic */ ShowEquitiesLadder copy$default(ShowEquitiesLadder showEquitiesLadder, LinkingGroup linkingGroup, Instrument instrument, int i, Object obj) {
            if ((i & 1) != 0) {
                linkingGroup = showEquitiesLadder.group;
            }
            if ((i & 2) != 0) {
                instrument = showEquitiesLadder.instrument;
            }
            return showEquitiesLadder.copy(linkingGroup, instrument);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkingGroup getGroup() {
            return this.group;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final ShowEquitiesLadder copy(LinkingGroup group, Instrument instrument) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new ShowEquitiesLadder(group, instrument);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowEquitiesLadder)) {
                return false;
            }
            ShowEquitiesLadder showEquitiesLadder = (ShowEquitiesLadder) other;
            return Intrinsics.areEqual(this.group, showEquitiesLadder.group) && Intrinsics.areEqual(this.instrument, showEquitiesLadder.instrument);
        }

        public int hashCode() {
            return (this.group.hashCode() * 31) + this.instrument.hashCode();
        }

        public String toString() {
            return "ShowEquitiesLadder(group=" + this.group + ", instrument=" + this.instrument + ")";
        }

        public final LinkingGroup getGroup() {
            return this.group;
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowEquitiesLadder(LinkingGroup group, Instrument instrument) {
            super(null);
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.group = group;
            this.instrument = instrument;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowUnsupportedError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/store/linking/LinkingGroup;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;)V", "getGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowUnsupportedError, reason: from toString */
    public static final /* data */ class ShowUnsupportedError extends MobileLinkingHostDuxo8 {
        public static final int $stable = 8;
        private final LinkingGroup group;

        public static /* synthetic */ ShowUnsupportedError copy$default(ShowUnsupportedError showUnsupportedError, LinkingGroup linkingGroup, int i, Object obj) {
            if ((i & 1) != 0) {
                linkingGroup = showUnsupportedError.group;
            }
            return showUnsupportedError.copy(linkingGroup);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkingGroup getGroup() {
            return this.group;
        }

        public final ShowUnsupportedError copy(LinkingGroup group) {
            Intrinsics.checkNotNullParameter(group, "group");
            return new ShowUnsupportedError(group);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowUnsupportedError) && Intrinsics.areEqual(this.group, ((ShowUnsupportedError) other).group);
        }

        public int hashCode() {
            return this.group.hashCode();
        }

        public String toString() {
            return "ShowUnsupportedError(group=" + this.group + ")";
        }

        public final LinkingGroup getGroup() {
            return this.group;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUnsupportedError(LinkingGroup group) {
            super(null);
            Intrinsics.checkNotNullParameter(group, "group");
            this.group = group;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNoWidgetsError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/store/linking/LinkingGroup;", "<init>", "(Lcom/robinhood/android/store/linking/LinkingGroup;)V", "getGroup", "()Lcom/robinhood/android/store/linking/LinkingGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowNoWidgetsError, reason: from toString */
    public static final /* data */ class ShowNoWidgetsError extends MobileLinkingHostDuxo8 {
        public static final int $stable = 8;
        private final LinkingGroup group;

        public static /* synthetic */ ShowNoWidgetsError copy$default(ShowNoWidgetsError showNoWidgetsError, LinkingGroup linkingGroup, int i, Object obj) {
            if ((i & 1) != 0) {
                linkingGroup = showNoWidgetsError.group;
            }
            return showNoWidgetsError.copy(linkingGroup);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkingGroup getGroup() {
            return this.group;
        }

        public final ShowNoWidgetsError copy(LinkingGroup group) {
            Intrinsics.checkNotNullParameter(group, "group");
            return new ShowNoWidgetsError(group);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowNoWidgetsError) && Intrinsics.areEqual(this.group, ((ShowNoWidgetsError) other).group);
        }

        public int hashCode() {
            return this.group.hashCode();
        }

        public String toString() {
            return "ShowNoWidgetsError(group=" + this.group + ")";
        }

        public final LinkingGroup getGroup() {
            return this.group;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNoWidgetsError(LinkingGroup group) {
            super(null);
            Intrinsics.checkNotNullParameter(group, "group");
            this.group = group;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNoLinkedGroupError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowNoLinkedGroupError */
    public static final /* data */ class ShowNoLinkedGroupError extends MobileLinkingHostDuxo8 {
        public static final int $stable = 0;
        public static final ShowNoLinkedGroupError INSTANCE = new ShowNoLinkedGroupError();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowNoLinkedGroupError);
        }

        public int hashCode() {
            return 401392464;
        }

        public String toString() {
            return "ShowNoLinkedGroupError";
        }

        private ShowNoLinkedGroupError() {
            super(null);
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\t\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0017\u0010\n\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowNetworkError;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowNetworkError, reason: from toString */
    public static final /* data */ class ShowNetworkError extends MobileLinkingHostDuxo8 {
        public static final int $stable = 8;
        private final Exception exception;

        public static /* synthetic */ ShowNetworkError copy$default(ShowNetworkError showNetworkError, Exception exc, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = showNetworkError.exception;
            }
            return showNetworkError.copy(exc);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        public final ShowNetworkError copy(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return new ShowNetworkError(exception);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowNetworkError) && Intrinsics.areEqual(this.exception, ((ShowNetworkError) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        public String toString() {
            return "ShowNetworkError(exception=" + this.exception + ")";
        }

        public final Exception getException() {
            return this.exception;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNetworkError(Exception exception) {
            super(null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$ShowAccountTypeDialog;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "<init>", "(Lcom/robinhood/android/account/strings/DisplayName;)V", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$ShowAccountTypeDialog, reason: from toString */
    public static final /* data */ class ShowAccountTypeDialog extends MobileLinkingHostDuxo8 {
        public static final int $stable = DisplayName.$stable;
        private final DisplayName displayName;

        public static /* synthetic */ ShowAccountTypeDialog copy$default(ShowAccountTypeDialog showAccountTypeDialog, DisplayName displayName, int i, Object obj) {
            if ((i & 1) != 0) {
                displayName = showAccountTypeDialog.displayName;
            }
            return showAccountTypeDialog.copy(displayName);
        }

        /* renamed from: component1, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final ShowAccountTypeDialog copy(DisplayName displayName) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new ShowAccountTypeDialog(displayName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAccountTypeDialog) && Intrinsics.areEqual(this.displayName, ((ShowAccountTypeDialog) other).displayName);
        }

        public int hashCode() {
            return this.displayName.hashCode();
        }

        public String toString() {
            return "ShowAccountTypeDialog(displayName=" + this.displayName + ")";
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAccountTypeDialog(DisplayName displayName) {
            super(null);
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.displayName = displayName;
        }
    }

    /* compiled from: MobileLinkingHostDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent$TryPlaySound;", "Lcom/robinhood/android/feature/linking/MobileLinkingHostEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.feature.linking.MobileLinkingHostEvent$TryPlaySound */
    public static final /* data */ class TryPlaySound extends MobileLinkingHostDuxo8 {
        public static final int $stable = 0;
        public static final TryPlaySound INSTANCE = new TryPlaySound();

        public boolean equals(Object other) {
            return this == other || (other instanceof TryPlaySound);
        }

        public int hashCode() {
            return 2036046480;
        }

        public String toString() {
            return "TryPlaySound";
        }

        private TryPlaySound() {
            super(null);
        }
    }
}
