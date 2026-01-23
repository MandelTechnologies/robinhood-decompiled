package com.robinhood.android.microgramsdui.control;

import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.idl.Dto;
import com.robinhood.microgram.sdui.EmbeddedSectionResponse;
import com.robinhood.microgram.sdui.EmbeddedSectionResponse2;
import com.robinhood.microgram.sdui.InitialScreenData;
import com.robinhood.microgram.sdui.InitialScreenData2;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import dispatch.core.Suspend;
import java.io.IOException;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty7;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.android.HostMessageDispatcher;
import microgram.android.internal.InboundMessageRouter;
import microgram.p507ui.p508v1.EmbeddedSectionReadyResponseDto;
import microgram.p507ui.p508v1.InitialScreenDataDto;
import microgram.p507ui.p508v1.MicrogramUiTypeDto;

/* compiled from: UiInitializer.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001*BU\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J,\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u001cj\u0004\u0018\u0001`$2\b\u0010%\u001a\u0004\u0018\u00010\u001fH\u0096@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020\u0004H\u0096@¢\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\u0004H\u0096@¢\u0006\u0002\u0010(R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/RealUiInitializer;", "Lcom/robinhood/android/microgramsdui/control/UiInitializer;", "uiControllerCompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "inboundMessageRouter", "Lmicrogram/android/internal/InboundMessageRouter;", "json", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "legacyUiControllerProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "idlUiControllerProvider", "Lcom/robinhood/android/microgramsdui/control/IdlUiController;", "<init>", "(Lkotlinx/coroutines/CompletableDeferred;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/android/internal/InboundMessageRouter;Lkotlinx/serialization/json/Json;Lcom/robinhood/utils/moshi/LazyMoshi;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "embeddedSectionResponseAdapter", "Lcom/robinhood/android/microgramsdui/control/RealUiInitializer$SwitchingAdapter;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionResponse;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;", "initialScreenDataAdapter", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;", "startEmbeddedSection", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionResponse;", "launchArgument", "", "isDynamic", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startRouter", "Lcom/robinhood/microgram/sdui/AnyInitialScreenData;", "deeplink", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFromLegacyLaunchService", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startFromProtoLaunchService", "SwitchingAdapter", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.microgramsdui.control.RealUiInitializer, reason: use source file name */
/* loaded from: classes8.dex */
public final class UiInitializer2 implements UiInitializer {
    public static final int $stable = 8;
    private final SwitchingAdapter<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto> embeddedSectionResponseAdapter;
    private final Provider<IdlUiController> idlUiControllerProvider;
    private final InboundMessageRouter inboundMessageRouter;
    private final SwitchingAdapter<InitialScreenData, InitialScreenDataDto> initialScreenDataAdapter;
    private final Json json;
    private final Provider<LegacyUiController> legacyUiControllerProvider;
    private final HostMessageDispatcher messageDispatcher;
    private final LazyMoshi moshi;
    private final CompletableDeferred<UiController> uiControllerCompletableDeferred;

    public UiInitializer2(CompletableDeferred<UiController> uiControllerCompletableDeferred, HostMessageDispatcher messageDispatcher, InboundMessageRouter inboundMessageRouter, Json json, LazyMoshi moshi, Provider<LegacyUiController> legacyUiControllerProvider, Provider<IdlUiController> idlUiControllerProvider) {
        Intrinsics.checkNotNullParameter(uiControllerCompletableDeferred, "uiControllerCompletableDeferred");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(inboundMessageRouter, "inboundMessageRouter");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(legacyUiControllerProvider, "legacyUiControllerProvider");
        Intrinsics.checkNotNullParameter(idlUiControllerProvider, "idlUiControllerProvider");
        this.uiControllerCompletableDeferred = uiControllerCompletableDeferred;
        this.messageDispatcher = messageDispatcher;
        this.inboundMessageRouter = inboundMessageRouter;
        this.json = json;
        this.moshi = moshi;
        this.legacyUiControllerProvider = legacyUiControllerProvider;
        this.idlUiControllerProvider = idlUiControllerProvider;
        this.embeddedSectionResponseAdapter = new SwitchingAdapter<>(new Function0() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiInitializer2.embeddedSectionResponseAdapter$lambda$0(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiInitializer2.embeddedSectionResponseAdapter$lambda$1(this.f$0);
            }
        }, new PropertyReference1Impl() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$embeddedSectionResponseAdapter$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((EmbeddedSectionReadyResponseDto) obj).getMicrogram_ui_type();
            }
        });
        this.initialScreenDataAdapter = new SwitchingAdapter<>(new Function0() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiInitializer2.initialScreenDataAdapter$lambda$2(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UiInitializer2.initialScreenDataAdapter$lambda$3(this.f$0);
            }
        }, new PropertyReference1Impl() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$initialScreenDataAdapter$3
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((InitialScreenDataDto) obj).getMicrogram_ui_type();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter embeddedSectionResponseAdapter$lambda$0(UiInitializer2 uiInitializer2) {
        LazyMoshi lazyMoshi = uiInitializer2.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<EmbeddedSectionResponse>() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$embeddedSectionResponseAdapter$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter embeddedSectionResponseAdapter$lambda$1(UiInitializer2 uiInitializer2) {
        LazyMoshi lazyMoshi = uiInitializer2.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<EmbeddedSectionReadyResponseDto>() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$embeddedSectionResponseAdapter$lambda$1$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter initialScreenDataAdapter$lambda$2(UiInitializer2 uiInitializer2) {
        LazyMoshi lazyMoshi = uiInitializer2.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<InitialScreenData>() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$initialScreenDataAdapter$lambda$2$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter initialScreenDataAdapter$lambda$3(UiInitializer2 uiInitializer2) {
        LazyMoshi lazyMoshi = uiInitializer2.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<InitialScreenDataDto>() { // from class: com.robinhood.android.microgramsdui.control.RealUiInitializer$initialScreenDataAdapter$lambda$3$$inlined$getAdapter$1
        }.getType());
    }

    /* compiled from: UiInitializer.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionResponse;", "Lmicrogram/ui/v1/EmbeddedSectionReadyResponseDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.RealUiInitializer$startEmbeddedSection$2", m3645f = "UiInitializer.kt", m3646l = {123, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.RealUiInitializer$startEmbeddedSection$2 */
    static final class C219482 extends ContinuationImpl7 implements Function1<Continuation<? super UiObject<? extends EmbeddedSectionResponse, ? extends EmbeddedSectionReadyResponseDto>>, Object> {
        final /* synthetic */ boolean $isDynamic;
        final /* synthetic */ String $launchArgument;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219482(boolean z, String str, Continuation<? super C219482> continuation) {
            super(1, continuation);
            this.$isDynamic = z;
            this.$launchArgument = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UiInitializer2.this.new C219482(this.$isDynamic, this.$launchArgument, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super UiObject<? extends EmbeddedSectionResponse, ? extends EmbeddedSectionReadyResponseDto>> continuation) {
            return invoke2((Continuation<? super UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>> continuation) {
            return ((C219482) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r10 == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            HostMessageDispatcher hostMessageDispatcher;
            UiController uiController;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HostMessageDispatcher hostMessageDispatcher2 = UiInitializer2.this.messageDispatcher;
                str = this.$isDynamic ? "embedded_section.start" : "ui.start";
                UiInitializer5 uiInitializer5 = new UiInitializer5(UiInitializer2.this, this.$launchArgument, null);
                this.L$0 = hostMessageDispatcher2;
                this.L$1 = str;
                this.label = 1;
                Object objWithDefault$default = Suspend.withDefault$default(null, uiInitializer5, this, 1, null);
                if (objWithDefault$default != coroutine_suspended) {
                    hostMessageDispatcher = hostMessageDispatcher2;
                    obj = objWithDefault$default;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String payload = ((Message) obj).getPayload();
                UiObject uiObjectFromJson = payload != null ? UiInitializer2.this.embeddedSectionResponseAdapter.fromJson(payload) : null;
                if (uiObjectFromJson instanceof UiObject.Legacy) {
                    uiController = (UiController) UiInitializer2.this.legacyUiControllerProvider.get();
                } else {
                    if (!(uiObjectFromJson instanceof UiObject.Idl)) {
                        if (uiObjectFromJson == null) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    uiController = (UiController) UiInitializer2.this.idlUiControllerProvider.get();
                }
                if (this.$isDynamic) {
                    uiController.dynamicEmbeddedSectionView(EmbeddedSectionResponse2.getIdentifier(uiObjectFromJson));
                } else {
                    uiController.getSingletonEmbeddedSectionView();
                }
                CompletableDeferred completableDeferred = UiInitializer2.this.uiControllerCompletableDeferred;
                Intrinsics.checkNotNull(uiController);
                completableDeferred.complete(uiController);
                return uiObjectFromJson;
            }
            str = (String) this.L$1;
            hostMessageDispatcher = (HostMessageDispatcher) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = hostMessageDispatcher.sendMessageWithReply(str, (Message) obj, this);
        }
    }

    @Override // com.robinhood.android.microgramsdui.control.UiInitializer
    public Object startEmbeddedSection(String str, boolean z, Continuation<? super UiObject<EmbeddedSectionResponse, EmbeddedSectionReadyResponseDto>> continuation) {
        return this.inboundMessageRouter.withUnknownTargetBuffering(new C219482(z, str, null), continuation);
    }

    /* compiled from: UiInitializer.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InitialScreenData;", "Lmicrogram/ui/v1/InitialScreenDataDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.RealUiInitializer$startRouter$2", m3645f = "UiInitializer.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 147}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.RealUiInitializer$startRouter$2 */
    static final class C219492 extends ContinuationImpl7 implements Function1<Continuation<? super UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>>, Object> {
        final /* synthetic */ String $deeplink;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219492(String str, Continuation<? super C219492> continuation) {
            super(1, continuation);
            this.$deeplink = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UiInitializer2.this.new C219492(this.$deeplink, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super UiObject<? extends InitialScreenData, ? extends InitialScreenDataDto>> continuation) {
            return invoke2((Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>> continuation) {
            return ((C219492) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        
            if (r8 == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            HostMessageDispatcher hostMessageDispatcher;
            String str;
            UiController uiController;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HostMessageDispatcher hostMessageDispatcher2 = UiInitializer2.this.messageDispatcher;
                UiInitializer6 uiInitializer6 = new UiInitializer6(UiInitializer2.this, this.$deeplink, null);
                this.L$0 = hostMessageDispatcher2;
                this.L$1 = "ui.start";
                this.label = 1;
                Object objWithDefault$default = Suspend.withDefault$default(null, uiInitializer6, this, 1, null);
                if (objWithDefault$default != coroutine_suspended) {
                    hostMessageDispatcher = hostMessageDispatcher2;
                    obj = objWithDefault$default;
                    str = "ui.start";
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String payload = ((Message) obj).getPayload();
                UiObject uiObjectFromJson = payload != null ? UiInitializer2.this.initialScreenDataAdapter.fromJson(payload) : null;
                if (uiObjectFromJson instanceof UiObject.Legacy) {
                    uiController = (UiController) UiInitializer2.this.legacyUiControllerProvider.get();
                } else {
                    if (!(uiObjectFromJson instanceof UiObject.Idl)) {
                        if (uiObjectFromJson == null) {
                            return null;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    uiController = (UiController) UiInitializer2.this.idlUiControllerProvider.get();
                }
                uiController.routerView(InitialScreenData2.getRouterIdentifier(uiObjectFromJson));
                uiController.screenView(InitialScreenData2.getScreenIdentifier(uiObjectFromJson), InitialScreenData2.getScreenType(uiObjectFromJson));
                CompletableDeferred completableDeferred = UiInitializer2.this.uiControllerCompletableDeferred;
                Intrinsics.checkNotNull(uiController);
                completableDeferred.complete(uiController);
                return uiObjectFromJson;
            }
            str = (String) this.L$1;
            hostMessageDispatcher = (HostMessageDispatcher) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = hostMessageDispatcher.sendMessageWithReply(str, (Message) obj, this);
        }
    }

    @Override // com.robinhood.android.microgramsdui.control.UiInitializer
    public Object startRouter(String str, Continuation<? super UiObject<InitialScreenData, InitialScreenDataDto>> continuation) {
        return this.inboundMessageRouter.withUnknownTargetBuffering(new C219492(str, null), continuation);
    }

    @Override // com.robinhood.android.microgramsdui.control.UiInitializer
    public Object startFromLegacyLaunchService(Continuation<? super UiController> continuation) {
        CompletableDeferred<UiController> completableDeferred = this.uiControllerCompletableDeferred;
        LegacyUiController legacyUiController = this.legacyUiControllerProvider.get();
        Intrinsics.checkNotNullExpressionValue(legacyUiController, "get(...)");
        completableDeferred.complete(legacyUiController);
        return this.uiControllerCompletableDeferred.getCompleted();
    }

    @Override // com.robinhood.android.microgramsdui.control.UiInitializer
    public Object startFromProtoLaunchService(Continuation<? super UiController> continuation) {
        CompletableDeferred<UiController> completableDeferred = this.uiControllerCompletableDeferred;
        IdlUiController idlUiController = this.idlUiControllerProvider.get();
        Intrinsics.checkNotNullExpressionValue(idlUiController, "get(...)");
        completableDeferred.complete(idlUiController);
        return this.uiControllerCompletableDeferred.getCompleted();
    }

    /* compiled from: UiInitializer.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u0004*\u00020\u00022\u00020\u0005BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\t\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/RealUiInitializer$SwitchingAdapter;", "LegacyT", "Landroid/os/Parcelable;", "IdlT", "Lcom/robinhood/idl/Dto;", "", "getLegacyAdapter", "Lkotlin/Function0;", "Lcom/squareup/moshi/JsonAdapter;", "getIdlAdapter", "uiTypeProperty", "Lkotlin/reflect/KProperty1;", "Lmicrogram/ui/v1/MicrogramUiTypeDto;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/reflect/KProperty1;)V", "legacyAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "legacyAdapter$delegate", "Lkotlin/Lazy;", "idlAdapter", "idlAdapter$delegate", "fromJson", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "string", "", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.RealUiInitializer$SwitchingAdapter */
    private static final class SwitchingAdapter<LegacyT extends Parcelable, IdlT extends Dto<?> & Parcelable> {

        /* renamed from: idlAdapter$delegate, reason: from kotlin metadata */
        private final Lazy idlAdapter;

        /* renamed from: legacyAdapter$delegate, reason: from kotlin metadata */
        private final Lazy legacyAdapter;
        private final KProperty7<IdlT, MicrogramUiTypeDto> uiTypeProperty;

        /* JADX WARN: Multi-variable type inference failed */
        public SwitchingAdapter(Function0<? extends JsonAdapter<LegacyT>> getLegacyAdapter, Function0<? extends JsonAdapter<IdlT>> getIdlAdapter, KProperty7<IdlT, ? extends MicrogramUiTypeDto> uiTypeProperty) {
            Intrinsics.checkNotNullParameter(getLegacyAdapter, "getLegacyAdapter");
            Intrinsics.checkNotNullParameter(getIdlAdapter, "getIdlAdapter");
            Intrinsics.checkNotNullParameter(uiTypeProperty, "uiTypeProperty");
            this.uiTypeProperty = uiTypeProperty;
            this.legacyAdapter = LazyKt.lazy(getLegacyAdapter);
            this.idlAdapter = LazyKt.lazy(getIdlAdapter);
        }

        private final JsonAdapter<LegacyT> getLegacyAdapter() {
            return (JsonAdapter) this.legacyAdapter.getValue();
        }

        private final JsonAdapter<IdlT> getIdlAdapter() {
            return (JsonAdapter) this.idlAdapter.getValue();
        }

        public final UiObject<LegacyT, IdlT> fromJson(String string2) throws IOException {
            JsonDataException jsonDataException;
            Intrinsics.checkNotNullParameter(string2, "string");
            try {
                Dto dto = (Dto) getIdlAdapter().fromJson(string2);
                jsonDataException = null;
                if ((dto != null ? this.uiTypeProperty.get(dto) : null) == MicrogramUiTypeDto.TYPE_PROTO) {
                    return new UiObject.Idl(dto);
                }
            } catch (JsonDataException e) {
                jsonDataException = e;
            }
            try {
                LegacyT legacytFromJson = getLegacyAdapter().fromJson(string2);
                if (legacytFromJson != null) {
                    return new UiObject.Legacy(legacytFromJson);
                }
                throw new IllegalStateException("Required value was null.");
            } catch (JsonDataException e2) {
                if (jsonDataException != null) {
                    e2.addSuppressed(jsonDataException);
                }
                throw e2;
            }
        }
    }
}
