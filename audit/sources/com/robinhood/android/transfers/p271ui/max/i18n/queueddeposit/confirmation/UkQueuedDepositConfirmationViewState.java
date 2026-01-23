package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.confirmation;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: UkQueuedDepositConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState;", "", "title", "", "subtitle", "dataRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDataRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getDisclosure", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "DataRow", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UkQueuedDepositConfirmationViewState {
    public static final int $stable = 0;
    private final ImmutableList<DataRow> dataRows;
    private final String disclosure;
    private final String subtitle;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UkQueuedDepositConfirmationViewState copy$default(UkQueuedDepositConfirmationViewState ukQueuedDepositConfirmationViewState, String str, String str2, ImmutableList immutableList, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ukQueuedDepositConfirmationViewState.title;
        }
        if ((i & 2) != 0) {
            str2 = ukQueuedDepositConfirmationViewState.subtitle;
        }
        if ((i & 4) != 0) {
            immutableList = ukQueuedDepositConfirmationViewState.dataRows;
        }
        if ((i & 8) != 0) {
            str3 = ukQueuedDepositConfirmationViewState.disclosure;
        }
        return ukQueuedDepositConfirmationViewState.copy(str, str2, immutableList, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<DataRow> component3() {
        return this.dataRows;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final UkQueuedDepositConfirmationViewState copy(String title, String subtitle, ImmutableList<? extends DataRow> dataRows, String disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(dataRows, "dataRows");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        return new UkQueuedDepositConfirmationViewState(title, subtitle, dataRows, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UkQueuedDepositConfirmationViewState)) {
            return false;
        }
        UkQueuedDepositConfirmationViewState ukQueuedDepositConfirmationViewState = (UkQueuedDepositConfirmationViewState) other;
        return Intrinsics.areEqual(this.title, ukQueuedDepositConfirmationViewState.title) && Intrinsics.areEqual(this.subtitle, ukQueuedDepositConfirmationViewState.subtitle) && Intrinsics.areEqual(this.dataRows, ukQueuedDepositConfirmationViewState.dataRows) && Intrinsics.areEqual(this.disclosure, ukQueuedDepositConfirmationViewState.disclosure);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.dataRows.hashCode()) * 31) + this.disclosure.hashCode();
    }

    public String toString() {
        return "UkQueuedDepositConfirmationViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", dataRows=" + this.dataRows + ", disclosure=" + this.disclosure + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UkQueuedDepositConfirmationViewState(String title, String subtitle, ImmutableList<? extends DataRow> dataRows, String disclosure) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(dataRows, "dataRows");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        this.title = title;
        this.subtitle = subtitle;
        this.dataRows = dataRows;
        this.disclosure = disclosure;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ImmutableList<DataRow> getDataRows() {
        return this.dataRows;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: UkQueuedDepositConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow;", "", "Loading", "Loaded", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow$Loaded;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow$Loading;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DataRow {

        /* compiled from: UkQueuedDepositConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow$Loading;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements DataRow {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 1478020098;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: UkQueuedDepositConfirmationViewState.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow$Loaded;", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/confirmation/UkQueuedDepositConfirmationViewState$DataRow;", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements DataRow {
            public static final int $stable = StringResource.$stable;
            private final StringResource label;
            private final String value;

            public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    stringResource = loaded.label;
                }
                if ((i & 2) != 0) {
                    str = loaded.value;
                }
                return loaded.copy(stringResource, str);
            }

            /* renamed from: component1, reason: from getter */
            public final StringResource getLabel() {
                return this.label;
            }

            /* renamed from: component2, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final Loaded copy(StringResource label, String value) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                return new Loaded(label, value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.areEqual(this.label, loaded.label) && Intrinsics.areEqual(this.value, loaded.value);
            }

            public int hashCode() {
                return (this.label.hashCode() * 31) + this.value.hashCode();
            }

            public String toString() {
                return "Loaded(label=" + this.label + ", value=" + this.value + ")";
            }

            public Loaded(StringResource label, String value) {
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(value, "value");
                this.label = label;
                this.value = value;
            }

            public final StringResource getLabel() {
                return this.label;
            }

            public final String getValue() {
                return this.value;
            }
        }
    }
}
