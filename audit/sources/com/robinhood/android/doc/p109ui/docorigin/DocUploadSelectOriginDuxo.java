package com.robinhood.android.doc.p109ui.docorigin;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: DocUploadSelectOriginDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004\u0013\u0014\u0015\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$DataState;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$StateProvider;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$StateProvider;Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "ViewState", "DataState", "StateProvider", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DocUploadSelectOriginDuxo extends BaseDuxo<DataState, ViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocUploadSelectOriginDuxo(StateProvider stateProvider, UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new DataState(false, null, null, ((DocUploadDestination.SelectOrigin) companion.getArgs(savedStateHandle)).getDefaultCountry(), ((DocUploadDestination.SelectOrigin) companion.getArgs(savedStateHandle)).getOmittedCountries(), null, 39, null), stateProvider, duxoBundle);
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: DocUploadSelectOriginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Error;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Loaded;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Loading;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ViewState {

        /* compiled from: DocUploadSelectOriginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Loading;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements ViewState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -1457194833;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: DocUploadSelectOriginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Error;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements ViewState {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }

        /* compiled from: DocUploadSelectOriginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState$Loaded;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "options", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "<init>", "(Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loaded implements ViewState {
            public static final int $stable = 8;
            private final List<CountryCode> options;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = loaded.options;
                }
                return loaded.copy(list);
            }

            public final List<CountryCode> component1() {
                return this.options;
            }

            public final Loaded copy(List<? extends CountryCode> options) {
                Intrinsics.checkNotNullParameter(options, "options");
                return new Loaded(options);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loaded) && Intrinsics.areEqual(this.options, ((Loaded) other).options);
            }

            public int hashCode() {
                return this.options.hashCode();
            }

            public String toString() {
                return "Loaded(options=" + this.options + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Loaded(List<? extends CountryCode> options) {
                Intrinsics.checkNotNullParameter(options, "options");
                this.options = options;
            }

            public final List<CountryCode> getOptions() {
                return this.options;
            }
        }
    }

    /* compiled from: DocUploadSelectOriginDuxo.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$DataState;", "", "inExperiment", "", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "selected", "Lcom/robinhood/iso/countrycode/CountryCode;", "defaultCountryCode", "", "omittedCountries", "", "error", "", "<init>", "(ZLcom/robinhood/iso/countrycode/CountryCode$Supported;Lcom/robinhood/iso/countrycode/CountryCode;Ljava/lang/String;Ljava/util/List;Ljava/lang/Throwable;)V", "getInExperiment", "()Z", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "getSelected", "()Lcom/robinhood/iso/countrycode/CountryCode;", "getDefaultCountryCode", "()Ljava/lang/String;", "getOmittedCountries", "()Ljava/util/List;", "getError", "()Ljava/lang/Throwable;", "isLoaded", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataState {
        public static final int $stable = 8;
        private final String defaultCountryCode;
        private final Throwable error;
        private final boolean inExperiment;
        private final List<CountryCode> omittedCountries;
        private final CountryCode selected;
        private final CountryCode.Supported userLocality;

        public DataState() {
            this(false, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ DataState copy$default(DataState dataState, boolean z, CountryCode.Supported supported, CountryCode countryCode, String str, List list, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                z = dataState.inExperiment;
            }
            if ((i & 2) != 0) {
                supported = dataState.userLocality;
            }
            if ((i & 4) != 0) {
                countryCode = dataState.selected;
            }
            if ((i & 8) != 0) {
                str = dataState.defaultCountryCode;
            }
            if ((i & 16) != 0) {
                list = dataState.omittedCountries;
            }
            if ((i & 32) != 0) {
                th = dataState.error;
            }
            List list2 = list;
            Throwable th2 = th;
            return dataState.copy(z, supported, countryCode, str, list2, th2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInExperiment() {
            return this.inExperiment;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryCode.Supported getUserLocality() {
            return this.userLocality;
        }

        /* renamed from: component3, reason: from getter */
        public final CountryCode getSelected() {
            return this.selected;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        public final List<CountryCode> component5() {
            return this.omittedCountries;
        }

        /* renamed from: component6, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final DataState copy(boolean inExperiment, CountryCode.Supported userLocality, CountryCode selected, String defaultCountryCode, List<? extends CountryCode> omittedCountries, Throwable error) {
            Intrinsics.checkNotNullParameter(omittedCountries, "omittedCountries");
            return new DataState(inExperiment, userLocality, selected, defaultCountryCode, omittedCountries, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataState)) {
                return false;
            }
            DataState dataState = (DataState) other;
            return this.inExperiment == dataState.inExperiment && Intrinsics.areEqual(this.userLocality, dataState.userLocality) && Intrinsics.areEqual(this.selected, dataState.selected) && Intrinsics.areEqual(this.defaultCountryCode, dataState.defaultCountryCode) && Intrinsics.areEqual(this.omittedCountries, dataState.omittedCountries) && Intrinsics.areEqual(this.error, dataState.error);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.inExperiment) * 31;
            CountryCode.Supported supported = this.userLocality;
            int iHashCode2 = (iHashCode + (supported == null ? 0 : supported.hashCode())) * 31;
            CountryCode countryCode = this.selected;
            int iHashCode3 = (iHashCode2 + (countryCode == null ? 0 : countryCode.hashCode())) * 31;
            String str = this.defaultCountryCode;
            int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.omittedCountries.hashCode()) * 31;
            Throwable th = this.error;
            return iHashCode4 + (th != null ? th.hashCode() : 0);
        }

        public String toString() {
            return "DataState(inExperiment=" + this.inExperiment + ", userLocality=" + this.userLocality + ", selected=" + this.selected + ", defaultCountryCode=" + this.defaultCountryCode + ", omittedCountries=" + this.omittedCountries + ", error=" + this.error + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataState(boolean z, CountryCode.Supported supported, CountryCode countryCode, String str, List<? extends CountryCode> omittedCountries, Throwable th) {
            Intrinsics.checkNotNullParameter(omittedCountries, "omittedCountries");
            this.inExperiment = z;
            this.userLocality = supported;
            this.selected = countryCode;
            this.defaultCountryCode = str;
            this.omittedCountries = omittedCountries;
            this.error = th;
        }

        public final boolean getInExperiment() {
            return this.inExperiment;
        }

        public final CountryCode.Supported getUserLocality() {
            return this.userLocality;
        }

        public final CountryCode getSelected() {
            return this.selected;
        }

        public final String getDefaultCountryCode() {
            return this.defaultCountryCode;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ DataState(boolean r2, com.robinhood.iso.countrycode.CountryCode.Supported r3, com.robinhood.iso.countrycode.CountryCode r4, java.lang.String r5, java.util.List r6, java.lang.Throwable r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lb
                r3 = r0
            Lb:
                r9 = r8 & 4
                if (r9 == 0) goto L10
                r4 = r0
            L10:
                r9 = r8 & 8
                if (r9 == 0) goto L15
                r5 = r0
            L15:
                r9 = r8 & 16
                if (r9 == 0) goto L1d
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            L1d:
                r8 = r8 & 32
                if (r8 == 0) goto L29
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L30
            L29:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L30:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.doc.p109ui.docorigin.DocUploadSelectOriginDuxo.DataState.<init>(boolean, com.robinhood.iso.countrycode.CountryCode$Supported, com.robinhood.iso.countrycode.CountryCode, java.lang.String, java.util.List, java.lang.Throwable, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final List<CountryCode> getOmittedCountries() {
            return this.omittedCountries;
        }

        public final Throwable getError() {
            return this.error;
        }

        public final boolean isLoaded() {
            return (this.userLocality == null && this.error == null) ? false : true;
        }
    }

    /* compiled from: DocUploadSelectOriginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$DataState;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;", "<init>", "()V", "reduce", "dataState", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class StateProvider implements com.robinhood.android.udf.StateProvider<DataState, ViewState> {
        public static final int $stable = 0;

        @Override // com.robinhood.android.udf.StateProvider
        public ViewState reduce(DataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (!dataState.isLoaded()) {
                return ViewState.Loading.INSTANCE;
            }
            if (dataState.getError() != null) {
                return new ViewState.Error(dataState.getError());
            }
            return new ViewState.Loaded(UtilKt.allCountriesExcept(dataState.getOmittedCountries(), UtilKt.resolveTargetCountry(dataState.getUserLocality(), dataState.getDefaultCountryCode(), dataState.getOmittedCountries())));
        }
    }

    /* compiled from: DocUploadSelectOriginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {85}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1 */
    static final class C143471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143471(Continuation<? super C143471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadSelectOriginDuxo.this.new C143471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(DocUploadSelectOriginDuxo.this.userStore.getUser()), Integer.MAX_VALUE, null, 2, null);
                Flow flowM28818catch = FlowKt.m28818catch(new Flow<CountryCode.Supported>() { // from class: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                CountryCode.Supported locality = ((User) obj).getOrigin().getLocality();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(locality, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CountryCode.Supported> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new AnonymousClass2(DocUploadSelectOriginDuxo.this, null));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(DocUploadSelectOriginDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowM28818catch, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: DocUploadSelectOriginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$2", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function3<FlowCollector<? super CountryCode.Supported>, Throwable, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocUploadSelectOriginDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DocUploadSelectOriginDuxo docUploadSelectOriginDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
                this.this$0 = docUploadSelectOriginDuxo;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super CountryCode.Supported> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = th;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DocUploadSelectOriginDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$2$1", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DataState, Continuation<? super DataState>, Object> {

                /* renamed from: $e */
                final /* synthetic */ Throwable f4112$e;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Throwable th, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.f4112$e = th;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f4112$e, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DataState dataState, Continuation<? super DataState> continuation) {
                    return ((AnonymousClass1) create(dataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DataState.copy$default((DataState) this.L$0, false, null, null, null, null, this.f4112$e, 31, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Throwable) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: DocUploadSelectOriginDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$3", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CountryCode.Supported, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocUploadSelectOriginDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(DocUploadSelectOriginDuxo docUploadSelectOriginDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = docUploadSelectOriginDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CountryCode.Supported supported, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(supported, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DocUploadSelectOriginDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$3$1", m3645f = "DocUploadSelectOriginDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.doc.ui.docorigin.DocUploadSelectOriginDuxo$onCreate$1$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DataState, Continuation<? super DataState>, Object> {
                final /* synthetic */ CountryCode.Supported $locality;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CountryCode.Supported supported, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$locality = supported;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$locality, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DataState dataState, Continuation<? super DataState> continuation) {
                    return ((AnonymousClass1) create(dataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return DataState.copy$default((DataState) this.L$0, false, this.$locality, null, null, null, null, 61, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CountryCode.Supported) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C143471(null));
    }

    /* compiled from: DocUploadSelectOriginDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelectOrigin;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DocUploadSelectOriginDuxo, DocUploadDestination.SelectOrigin> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.SelectOrigin getArgs(SavedStateHandle savedStateHandle) {
            return (DocUploadDestination.SelectOrigin) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DocUploadDestination.SelectOrigin getArgs(DocUploadSelectOriginDuxo docUploadSelectOriginDuxo) {
            return (DocUploadDestination.SelectOrigin) DuxoCompanion.DefaultImpls.getArgs(this, docUploadSelectOriginDuxo);
        }
    }
}
