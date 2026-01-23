package com.stripe.android.core.networking;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;

/* compiled from: AnalyticsRequestV2Storage.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "Landroid/content/SharedPreferences;", "sharedPrefs", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/SharedPreferences;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Landroid/app/Application;", "application", "(Landroid/app/Application;)V", "", "id", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "retrieve", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "Lkotlinx/coroutines/CoroutineDispatcher;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage, reason: use source file name */
/* loaded from: classes10.dex */
public final class AnalyticsRequestV2Storage2 implements AnalyticsRequestV2Storage {
    private final CoroutineDispatcher dispatcher;
    private final SharedPreferences sharedPrefs;

    private AnalyticsRequestV2Storage2(SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher) {
        this.sharedPrefs = sharedPreferences;
        this.dispatcher = coroutineDispatcher;
    }

    /* synthetic */ AnalyticsRequestV2Storage2(SharedPreferences sharedPreferences, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsRequestV2Storage2(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("StripeAnalyticsRequestV2Storage", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this(sharedPreferences, null, 2, 0 == true ? 1 : 0);
    }

    /* compiled from: AnalyticsRequestV2Storage.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$retrieve$2", m3645f = "AnalyticsRequestV2Storage.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$retrieve$2 */
    static final class C425202 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super AnalyticsRequestV2>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C425202(String str, Continuation<? super C425202> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AnalyticsRequestV2Storage2.this.new C425202(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsRequestV2> continuation) {
            return ((C425202) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String string2 = AnalyticsRequestV2Storage2.this.sharedPrefs.getString(this.$id, null);
                if (string2 == null) {
                    return null;
                }
                AnalyticsRequestV2Storage2.this.sharedPrefs.edit().remove(this.$id).apply();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Json.Companion companion2 = Json.INSTANCE;
                    companion2.getSerializersModule();
                    objM28550constructorimpl = Result.m28550constructorimpl((AnalyticsRequestV2) companion2.decodeFromString(AnalyticsRequestV2.INSTANCE.serializer(), string2));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
                    return null;
                }
                return objM28550constructorimpl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestV2Storage
    public Object retrieve(String str, Continuation<? super AnalyticsRequestV2> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C425202(str, null), continuation);
    }
}
