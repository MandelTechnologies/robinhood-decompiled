package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import com.plaid.internal.EnumC7081g;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.UiComponentConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;

/* compiled from: UiStepSavedStateHelper.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007J.\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "configFile", "Ljava/io/File;", "savedData", "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "saveComponentConfigs", "", "sessionToken", "", "inquiryId", "stepName", "componentConfigs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "restoreComponentConfigs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSavedState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "UiStepUiComponentConfig", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UiStepSavedStateHelper {
    private final File configFile;
    private final CoroutineScope coroutineScope;
    private UiStepUiComponentConfig savedData;

    public UiStepSavedStateHelper(Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    /* compiled from: UiStepSavedStateHelper.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;", "Landroid/os/Parcelable;", "sessionToken", "", "inquiryId", "stepName", "uiComponentConfig", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSessionToken", "()Ljava/lang/String;", "getInquiryId", "getStepName", "getUiComponentConfig", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UiStepUiComponentConfig implements Parcelable {
        public static final Parcelable.Creator<UiStepUiComponentConfig> CREATOR = new Creator();
        private final String inquiryId;
        private final String sessionToken;
        private final String stepName;
        private final List<UiComponentConfig> uiComponentConfig;

        /* compiled from: UiStepSavedStateHelper.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepUiComponentConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepUiComponentConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(UiStepUiComponentConfig.class.getClassLoader()));
                }
                return new UiStepUiComponentConfig(string2, string3, string4, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepUiComponentConfig[] newArray(int i) {
                return new UiStepUiComponentConfig[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.uiComponentConfig;
            dest.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UiStepUiComponentConfig(String sessionToken, String inquiryId, String stepName, List<? extends UiComponentConfig> uiComponentConfig) {
            Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            Intrinsics.checkNotNullParameter(uiComponentConfig, "uiComponentConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.stepName = stepName;
            this.uiComponentConfig = uiComponentConfig;
        }

        public final String getSessionToken() {
            return this.sessionToken;
        }

        public final String getInquiryId() {
            return this.inquiryId;
        }

        public final String getStepName() {
            return this.stepName;
        }

        public final List<UiComponentConfig> getUiComponentConfig() {
            return this.uiComponentConfig;
        }
    }

    public final void saveComponentConfigs(String sessionToken, String inquiryId, String stepName, List<? extends UiComponentConfig> componentConfigs) {
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        if (!Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalArgumentException("saveComponentConfigs must be called on the main thread.");
        }
        if (componentConfigs == null) {
            return;
        }
        UiStepUiComponentConfig uiStepUiComponentConfig = this.savedData;
        if (Intrinsics.areEqual(uiStepUiComponentConfig != null ? uiStepUiComponentConfig.getSessionToken() : null, sessionToken)) {
            UiStepUiComponentConfig uiStepUiComponentConfig2 = this.savedData;
            if (Intrinsics.areEqual(uiStepUiComponentConfig2 != null ? uiStepUiComponentConfig2.getInquiryId() : null, inquiryId)) {
                UiStepUiComponentConfig uiStepUiComponentConfig3 = this.savedData;
                if (Intrinsics.areEqual(uiStepUiComponentConfig3 != null ? uiStepUiComponentConfig3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        UiStepUiComponentConfig uiStepUiComponentConfig4 = new UiStepUiComponentConfig(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = uiStepUiComponentConfig4;
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C436322(uiStepUiComponentConfig4, null), 3, null);
    }

    /* compiled from: UiStepSavedStateHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", m3645f = "UiStepSavedStateHelper.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2 */
    static final class C436322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiStepUiComponentConfig $newData;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436322(UiStepUiComponentConfig uiStepUiComponentConfig, Continuation<? super C436322> continuation) {
            super(2, continuation);
            this.$newData = uiStepUiComponentConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UiStepSavedStateHelper.this.new C436322(this.$newData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    File parentFile = UiStepSavedStateHelper.this.configFile.getParentFile();
                    if (parentFile != null) {
                        boxing.boxBoolean(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(WebsocketGatewayConstants.DATA_KEY, this.$newData);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(UiStepSavedStateHelper.this, bundle, null);
                    this.label = 1;
                    if (BuildersKt.withContext(io2, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }

        /* compiled from: UiStepSavedStateHelper.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", m3645f = "UiStepSavedStateHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bundle $bundle;
            int label;
            final /* synthetic */ UiStepSavedStateHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiStepSavedStateHelper uiStepSavedStateHelper, Bundle bundle, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uiStepSavedStateHelper;
                this.$bundle = bundle;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$bundle, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    FileOutputStream fileOutputStream = new FileOutputStream(this.this$0.configFile);
                    Bundle bundle = this.$bundle;
                    try {
                        Parcel parcelObtain = Parcel.obtain();
                        Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                        parcelObtain.writeBundle(bundle);
                        fileOutputStream.write(parcelObtain.marshall());
                        parcelObtain.recycle();
                        Unit unit = Unit.INSTANCE;
                        Closeable.closeFinally(fileOutputStream, null);
                        return Unit.INSTANCE;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: UiStepSavedStateHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", m3645f = "UiStepSavedStateHelper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2 */
    static final class C436312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends UiComponentConfig>>, Object> {
        final /* synthetic */ String $inquiryId;
        final /* synthetic */ String $sessionToken;
        final /* synthetic */ String $stepName;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C436312(String str, String str2, String str3, Continuation<? super C436312> continuation) {
            super(2, continuation);
            this.$sessionToken = str;
            this.$inquiryId = str2;
            this.$stepName = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UiStepSavedStateHelper.this.new C436312(this.$sessionToken, this.$inquiryId, this.$stepName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends UiComponentConfig>> continuation) {
            return ((C436312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r9, r2, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v8, types: [android.os.Parcel] */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            UiStepUiComponentConfig uiStepUiComponentConfig;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Parcel parcel = this.label;
            try {
                try {
                } catch (Exception unused) {
                    parcel.recycle();
                    uiStepUiComponentConfig = null;
                } catch (Throwable th) {
                    parcel.recycle();
                    throw th;
                }
                if (parcel == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!UiStepSavedStateHelper.this.configFile.exists()) {
                        return null;
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain(...)");
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    UiStepSavedStateHelper2 uiStepSavedStateHelper2 = new UiStepSavedStateHelper2(UiStepSavedStateHelper.this, parcelObtain, null);
                    this.L$0 = parcelObtain;
                    this.label = 1;
                    parcel = parcelObtain;
                    if (BuildersKt.withContext(io2, uiStepSavedStateHelper2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (parcel != 1) {
                        if (parcel != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uiStepUiComponentConfig = (UiStepUiComponentConfig) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        return uiStepUiComponentConfig.getUiComponentConfig();
                    }
                    Parcel parcel2 = (Parcel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    parcel = parcel2;
                }
                parcel.setDataPosition(0);
                Bundle bundle = parcel.readBundle(UiStepUiComponentConfig.class.getClassLoader());
                UiStepUiComponentConfig uiStepUiComponentConfig2 = bundle != null ? (UiStepUiComponentConfig) BundleCompat.getParcelable(bundle, WebsocketGatewayConstants.DATA_KEY, UiStepUiComponentConfig.class) : null;
                parcel.recycle();
                uiStepUiComponentConfig = uiStepUiComponentConfig2;
                if (uiStepUiComponentConfig != null && Intrinsics.areEqual(uiStepUiComponentConfig.getSessionToken(), this.$sessionToken) && Intrinsics.areEqual(uiStepUiComponentConfig.getInquiryId(), this.$inquiryId) && Intrinsics.areEqual(uiStepUiComponentConfig.getStepName(), this.$stepName)) {
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(UiStepSavedStateHelper.this, uiStepUiComponentConfig, null);
                    this.L$0 = uiStepUiComponentConfig;
                    this.label = 2;
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }

        /* compiled from: UiStepSavedStateHelper.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", m3645f = "UiStepSavedStateHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UiStepUiComponentConfig $restoredData;
            int label;
            final /* synthetic */ UiStepSavedStateHelper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(UiStepSavedStateHelper uiStepSavedStateHelper, UiStepUiComponentConfig uiStepUiComponentConfig, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = uiStepSavedStateHelper;
                this.$restoredData = uiStepUiComponentConfig;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$restoredData, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.savedData = this.$restoredData;
                return Unit.INSTANCE;
            }
        }
    }

    public final Object restoreComponentConfigs(String str, String str2, String str3, Continuation<? super List<? extends UiComponentConfig>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new C436312(str, str2, str3, null), continuation);
    }

    /* compiled from: UiStepSavedStateHelper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", m3645f = "UiStepSavedStateHelper.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2 */
    static final class C436302 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C436302(Continuation<? super C436302> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UiStepSavedStateHelper.this.new C436302(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436302) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                UiStepSavedStateHelper.this.configFile.delete();
                UiStepSavedStateHelper.this.savedData = null;
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object clearSavedState(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C436302(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
