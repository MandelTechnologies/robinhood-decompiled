package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.rating.RatingsApi;
import com.robinhood.android.equitydetail.p123ui.analystreports.AnalystReportDuxo;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.models.api.ApiAnalystReport;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: AnalystReportDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "ratingsApi", "Lcom/robinhood/android/api/rating/RatingsApi;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/android/api/rating/RatingsApi;Lcom/robinhood/librobinhood/data/store/QuoteStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "startDownload", "activity", "Landroid/app/Activity;", "destinationFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "instrument", "Lcom/robinhood/models/db/Instrument;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class AnalystReportDuxo extends OldBaseDuxo<AnalystReportViewState> implements HasSavedState {
    private final InstrumentStore instrumentStore;
    private final QuoteStore quoteStore;
    private final RatingsApi ratingsApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnalystReportDuxo(InstrumentStore instrumentStore, RatingsApi ratingsApi, QuoteStore quoteStore, SavedStateHandle savedStateHandle) {
        super(new AnalystReportViewState(null, null, null, false, false, null, 63, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(ratingsApi, "ratingsApi");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.instrumentStore = instrumentStore;
        this.ratingsApi = ratingsApi;
        this.quoteStore = quoteStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        InstrumentStore instrumentStore = this.instrumentStore;
        Companion companion = INSTANCE;
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(instrumentStore.getInstrument(((LegacyFragmentKey.AnalystReport) companion.getArgs((HasSavedState) this)).getInstrumentId())), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.onStart$lambda$1(this.f$0, (Instrument) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C154122(null), 3, null);
        Observable observableDistinctUntilChanged = this.quoteStore.getStreamQuote().asObservable(((LegacyFragmentKey.AnalystReport) companion.getArgs((HasSavedState) this)).getInstrumentId()).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Quote p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(p0.isUpForTheDay());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.onStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(AnalystReportDuxo analystReportDuxo, final Instrument instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        analystReportDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.onStart$lambda$1$lambda$0(instrument, (AnalystReportViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportViewState onStart$lambda$1$lambda$0(Instrument instrument, AnalystReportViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportViewState.copy$default(applyMutation, null, instrument, null, false, false, null, 61, null);
    }

    /* compiled from: AnalystReportDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$onStart$2", m3645f = "AnalystReportDuxo.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$onStart$2 */
    static final class C154122 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C154122(Continuation<? super C154122> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalystReportDuxo.this.new C154122(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C154122) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RatingsApi ratingsApi = AnalystReportDuxo.this.ratingsApi;
                    UUID instrumentId = ((LegacyFragmentKey.AnalystReport) AnalystReportDuxo.INSTANCE.getArgs((HasSavedState) AnalystReportDuxo.this)).getInstrumentId();
                    this.label = 1;
                    obj = ratingsApi.getAnalystReport(instrumentId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                final ApiAnalystReport apiAnalystReport = (ApiAnalystReport) obj;
                AnalystReportDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$onStart$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalystReportDuxo.C154122.invokeSuspend$lambda$0(apiAnalystReport, (AnalystReportViewState) obj2);
                    }
                });
            } catch (Throwable th) {
                AnalystReportDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$onStart$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AnalystReportDuxo.C154122.invokeSuspend$lambda$1(th, (AnalystReportViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnalystReportViewState invokeSuspend$lambda$0(ApiAnalystReport apiAnalystReport, AnalystReportViewState analystReportViewState) {
            return AnalystReportViewState.copy$default(analystReportViewState, apiAnalystReport, null, null, false, false, null, 62, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AnalystReportViewState invokeSuspend$lambda$1(Throwable th, AnalystReportViewState analystReportViewState) {
            return AnalystReportViewState.copy$default(analystReportViewState, null, null, new UiEvent(th), false, false, null, 59, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AnalystReportDuxo analystReportDuxo, final Boolean bool) {
        analystReportDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.onStart$lambda$3$lambda$2(bool, (AnalystReportViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportViewState onStart$lambda$3$lambda$2(Boolean bool, AnalystReportViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(bool);
        return AnalystReportViewState.copy$default(applyMutation, null, null, null, bool.booleanValue(), false, null, 55, null);
    }

    public final void startDownload(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.startDownload$lambda$4((AnalystReportViewState) obj);
            }
        });
        ObservableSource observableSourceSwitchMapSingle = getStates().takeUntil(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo.startDownload.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(AnalystReportViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (it.getReport() == null || it.getInstrument() == null) ? false : true;
            }
        }).takeLast(1).switchMapSingle(new Function() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo.startDownload.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(AnalystReportViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                ApiAnalystReport report = state.getReport();
                Intrinsics.checkNotNull(report);
                HttpUrl download_url = report.getDownload_url();
                Instrument instrument = state.getInstrument();
                Intrinsics.checkNotNull(instrument);
                File fileDestinationFile = AnalystReportDuxo.this.destinationFile(activity, instrument);
                if (fileDestinationFile.exists()) {
                    fileDestinationFile.delete();
                }
                Activity activity2 = activity;
                return Single.create(new DownloadManagerOnSubscribe(activity2, download_url, AnalystReportDuxo.this.destinationFile(activity2, instrument), false, 8, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMapSingle, "switchMapSingle(...)");
        bind((Observable) observableSourceSwitchMapSingle, LifecycleEvent.ON_DESTROY).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.startDownload$lambda$6(this.f$0, (File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportViewState startDownload$lambda$4(AnalystReportViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportViewState.copy$default(applyMutation, null, null, null, false, true, null, 47, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$6(AnalystReportDuxo analystReportDuxo, final File file) {
        analystReportDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportDuxo.startDownload$lambda$6$lambda$5(file, (AnalystReportViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnalystReportViewState startDownload$lambda$6$lambda$5(File file, AnalystReportViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AnalystReportViewState.copy$default(applyMutation, null, null, null, false, false, new UiEvent(file), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File destinationFile(Context context, Instrument instrument) {
        return new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), instrument.getId() + ".pdf");
    }

    /* compiled from: AnalystReportDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AnalystReport;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AnalystReportDuxo, LegacyFragmentKey.AnalystReport> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AnalystReport getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.AnalystReport) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AnalystReport getArgs(AnalystReportDuxo analystReportDuxo) {
            return (LegacyFragmentKey.AnalystReport) DuxoCompanion.DefaultImpls.getArgs(this, analystReportDuxo);
        }
    }
}
