package com.robinhood.android.store.linking;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import hippo.model.p469v1.AppSettingsDto;
import hippo.model.p469v1.BackgroundAuraDto;
import hippo.model.p469v1.BackgroundAuraVariantDto;
import hippo.model.p469v1.LinkingGroupDto;
import hippo.service.p470v1.BWWorkspaceService;
import hippo.service.p470v1.GetAllLinkingGroupsRequestDto;
import hippo.service.p470v1.GetAllLinkingGroupsResponseDto;
import hippo.service.p470v1.GetAppSettingsRequestDto;
import hippo.service.p470v1.GetAppSettingsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Duration;

/* compiled from: MobileLinkingStore.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rJ\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\rJ\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\rJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/store/linking/MobileLinkingStore;", "Lcom/robinhood/store/Store;", "api", "Lhippo/service/v1/BWWorkspaceService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lhippo/service/v1/BWWorkspaceService;Lcom/robinhood/store/StoreBundle;)V", "linkingGroupsEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lhippo/service/v1/GetAllLinkingGroupsRequestDto;", "Lhippo/service/v1/GetAllLinkingGroupsResponseDto;", "streamLinkingGroups", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/android/store/linking/LinkingGroup;", "appSettingsEndpoint", "Lhippo/service/v1/GetAppSettingsRequestDto;", "Lhippo/service/v1/GetAppSettingsResponseDto;", "streamAppSettings", "Lhippo/model/v1/AppSettingsDto;", "streamBackgroundAura", "Lhippo/model/v1/BackgroundAuraVariantDto;", "streamAccountNumber", "", "_selectedGroupIdFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "streamSelectedGroupId", "updateSelectedGroupId", "", "newGroupId", "lib-store-mobile-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MobileLinkingStore extends Store {
    private final StateFlow2<String> _selectedGroupIdFlow;
    private final BWWorkspaceService api;
    private final Endpoint<GetAppSettingsRequestDto, GetAppSettingsResponseDto> appSettingsEndpoint;
    private final Endpoint<GetAllLinkingGroupsRequestDto, GetAllLinkingGroupsResponseDto> linkingGroupsEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileLinkingStore(BWWorkspaceService api, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.linkingGroupsEndpoint = Endpoint.Companion.createWithParams$default(companion, new MobileLinkingStore4(api), getLogoutKillswitch(), new MobileLinkingStore5(null), storeBundle.getClock(), null, 16, null);
        this.appSettingsEndpoint = Endpoint.Companion.createWithParams$default(companion, new MobileLinkingStore2(api), getLogoutKillswitch(), new MobileLinkingStore3(null), storeBundle.getClock(), null, 16, null);
        this._selectedGroupIdFlow = StateFlow4.MutableStateFlow(null);
    }

    public final Flow<List<LinkingGroup>> streamLinkingGroups() {
        GetAllLinkingGroupsRequestDto getAllLinkingGroupsRequestDto = new GetAllLinkingGroupsRequestDto();
        Endpoint<GetAllLinkingGroupsRequestDto, GetAllLinkingGroupsResponseDto> endpoint = this.linkingGroupsEndpoint;
        Duration durationOfMillis = Duration.ofMillis(250L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, getAllLinkingGroupsRequestDto, durationOfMillis, null, 4, null);
        return new Flow<List<? extends LinkingGroup>>() { // from class: com.robinhood.android.store.linking.MobileLinkingStore$streamLinkingGroups$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamLinkingGroups$$inlined$map$1$2 */
            public static final class C287312<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.linking.MobileLinkingStore$streamLinkingGroups$$inlined$map$1$2", m3645f = "MobileLinkingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamLinkingGroups$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C287312.this.emit(null, this);
                    }
                }

                public C287312(FlowCollector flowCollector) {
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
                        List<LinkingGroupDto> linking_groups = ((GetAllLinkingGroupsResponseDto) obj).getLinking_groups();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linking_groups, 10));
                        Iterator<T> it = linking_groups.iterator();
                        while (it.hasNext()) {
                            arrayList.add(LinkingGroup2.toDbModel((LinkingGroupDto) it.next()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super List<? extends LinkingGroup>> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C287312(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<AppSettingsDto> streamAppSettings() {
        GetAppSettingsRequestDto getAppSettingsRequestDto = new GetAppSettingsRequestDto();
        Endpoint<GetAppSettingsRequestDto, GetAppSettingsResponseDto> endpoint = this.appSettingsEndpoint;
        Duration durationOfMillis = Duration.ofMillis(2500L);
        Intrinsics.checkNotNullExpressionValue(durationOfMillis, "ofMillis(...)");
        final Flow flowPoll$default = Endpoint.DefaultImpls.poll$default(endpoint, getAppSettingsRequestDto, durationOfMillis, null, 4, null);
        return FlowKt.filterNotNull(new Flow<AppSettingsDto>() { // from class: com.robinhood.android.store.linking.MobileLinkingStore$streamAppSettings$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAppSettings$$inlined$map$1$2 */
            public static final class C287292<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.linking.MobileLinkingStore$streamAppSettings$$inlined$map$1$2", m3645f = "MobileLinkingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAppSettings$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C287292.this.emit(null, this);
                    }
                }

                public C287292(FlowCollector flowCollector) {
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
                        AppSettingsDto app_settings = ((GetAppSettingsResponseDto) obj).getApp_settings();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(app_settings, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super AppSettingsDto> flowCollector, Continuation continuation) {
                Object objCollect = flowPoll$default.collect(new C287292(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    public final Flow<BackgroundAuraVariantDto> streamBackgroundAura() {
        final Flow<AppSettingsDto> flowStreamAppSettings = streamAppSettings();
        return new Flow<BackgroundAuraVariantDto>() { // from class: com.robinhood.android.store.linking.MobileLinkingStore$streamBackgroundAura$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamBackgroundAura$$inlined$map$1$2 */
            public static final class C287302<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.linking.MobileLinkingStore$streamBackgroundAura$$inlined$map$1$2", m3645f = "MobileLinkingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamBackgroundAura$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C287302.this.emit(null, this);
                    }
                }

                public C287302(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BackgroundAuraVariantDto variant;
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
                        BackgroundAuraDto background_aura = ((AppSettingsDto) obj).getBackground_aura();
                        if (background_aura == null || (variant = background_aura.getVariant()) == null) {
                            variant = BackgroundAuraVariantDto.BACKGROUND_AURA_VARIANT_UNSPECIFIED;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(variant, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super BackgroundAuraVariantDto> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAppSettings.collect(new C287302(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<String> streamAccountNumber() {
        final Flow<AppSettingsDto> flowStreamAppSettings = streamAppSettings();
        final Flow<String> flow = new Flow<String>() { // from class: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$1$2 */
            public static final class C287272<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$1$2", m3645f = "MobileLinkingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$1$2$1, reason: invalid class name */
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
                        return C287272.this.emit(null, this);
                    }
                }

                public C287272(FlowCollector flowCollector) {
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
                        String last_selected_account = ((AppSettingsDto) obj).getLast_selected_account();
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(last_selected_account, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flowStreamAppSettings.collect(new C287272(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        return new Flow<String>() { // from class: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$2$2 */
            public static final class C287282<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$2$2", m3645f = "MobileLinkingStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.android.store.linking.MobileLinkingStore$streamAccountNumber$$inlined$map$2$2$1, reason: invalid class name */
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
                        return C287282.this.emit(null, this);
                    }
                }

                public C287282(FlowCollector flowCollector) {
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
                        String str = (String) obj;
                        if (StringsKt.isBlank(str)) {
                            str = null;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(str, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = flow.collect(new C287282(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    public final Flow<String> streamSelectedGroupId() {
        return FlowKt.filterNotNull(this._selectedGroupIdFlow);
    }

    public final void updateSelectedGroupId(String newGroupId) {
        Intrinsics.checkNotNullParameter(newGroupId, "newGroupId");
        this._selectedGroupIdFlow.setValue(newGroupId);
    }
}
