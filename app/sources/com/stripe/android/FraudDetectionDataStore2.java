package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* compiled from: FraudDetectionDataStore.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore;", "Lcom/stripe/android/FraudDetectionDataStore;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/networking/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "", "fraudDetectionData", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.stripe.android.DefaultFraudDetectionDataStore, reason: use source file name */
/* loaded from: classes10.dex */
public final class FraudDetectionDataStore2 implements FraudDetectionDataStore {

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public FraudDetectionDataStore2(final Context context, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.workContext = workContext;
        this.prefs = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.stripe.android.DefaultFraudDetectionDataStore$prefs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return context.getSharedPreferences("FraudDetectionDataStore", 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* compiled from: FraudDetectionDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/networking/FraudDetectionData;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.DefaultFraudDetectionDataStore$get$2", m3645f = "FraudDetectionDataStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.stripe.android.DefaultFraudDetectionDataStore$get$2 */
    static final class C424992 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C424992(Continuation<? super C424992> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C424992 c424992 = FraudDetectionDataStore2.this.new C424992(continuation);
            c424992.L$0 = obj;
            return c424992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((C424992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FraudDetectionDataStore2 fraudDetectionDataStore2 = FraudDetectionDataStore2.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                String string2 = fraudDetectionDataStore2.getPrefs().getString("key_fraud_detection_data", null);
                if (string2 == null) {
                    string2 = "";
                }
                final JSONObject jSONObject = new JSONObject(string2);
                objM28550constructorimpl = Result.m28550constructorimpl(new FraudDetectionDataJsonParser(new Function0<Long>() { // from class: com.stripe.android.DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Long invoke() {
                        return Long.valueOf(jSONObject.optLong("timestamp", -1L));
                    }
                }).parse(jSONObject));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                return null;
            }
            return objM28550constructorimpl;
        }
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public Object get(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new C424992(null), continuation);
    }

    @Override // com.stripe.android.FraudDetectionDataStore
    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        SharedPreferences prefs = getPrefs();
        Intrinsics.checkNotNullExpressionValue(prefs, "<get-prefs>(...)");
        SharedPreferences.Editor editorEdit = prefs.edit();
        editorEdit.putString("key_fraud_detection_data", fraudDetectionData.toJson().toString());
        editorEdit.apply();
    }

    /* compiled from: FraudDetectionDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore$Companion;", "", "()V", "KEY_DATA", "", "PREF_FILE", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.stripe.android.DefaultFraudDetectionDataStore$Companion */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
