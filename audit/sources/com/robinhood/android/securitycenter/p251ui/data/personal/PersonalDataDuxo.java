package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.app.Application;
import android.content.Context;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.markdown.elements.StrongerBoldMarkwonPlugin;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.pims.PimsStore;
import com.robinhood.models.api.pims.ApiDataSubjectListItem;
import com.robinhood.models.p355ui.UiPersonalDataRequestDetailsItem;
import com.robinhood.shared.security.contracts.PersonalDataRequestType;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContent;
import com.robinhood.staticcontent.model.expandablecontent.ApiExpandableContentSection;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.Preconditions;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PersonalDataDuxo.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "pimsStore", "Lcom/robinhood/librobinhood/data/store/pims/PimsStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "app", "Landroid/app/Application;", "markwonBuilder", "Lio/noties/markwon/Markwon$Builder;", "<init>", "(Lcom/robinhood/librobinhood/data/store/pims/PimsStore;Lcom/robinhood/contentful/StaticContentStore;Landroid/app/Application;Lio/noties/markwon/Markwon$Builder;)V", "markwon", "Lio/noties/markwon/Markwon;", "refresh", "", "requestType", "Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;", "getMostRecentRequest", "Lcom/robinhood/models/api/pims/ApiDataSubjectListItem;", "(Lcom/robinhood/shared/security/contracts/PersonalDataRequestType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRequestContent", "", "Lcom/robinhood/models/ui/UiPersonalDataRequestDetailsItem;", "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class PersonalDataDuxo extends OldBaseDuxo<PersonalDataViewState> {
    private static final String PERSONAL_DATA_ACCESS_REQUEST_CONTENTFUL_ID = "4gEmxsamJtJpLbgSVaXUPF";
    private static final String PERSONAL_DATA_DELETE_REQUEST_CONTENTFUL_ID = "5jea9jHt3cA8uXZPKtjxuZ";
    private final Markwon markwon;
    private final PimsStore pimsStore;
    private final StaticContentStore staticContentStore;
    public static final int $stable = 8;

    /* compiled from: PersonalDataDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonalDataRequestType.values().length];
            try {
                iArr[PersonalDataRequestType.ACCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonalDataRequestType.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PersonalDataDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo", m3645f = "PersonalDataDuxo.kt", m3646l = {77, 78}, m3647m = "getMostRecentRequest")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$getMostRecentRequest$1 */
    static final class C282241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C282241(Continuation<? super C282241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PersonalDataDuxo.this.getMostRecentRequest(null, this);
        }
    }

    /* compiled from: PersonalDataDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo", m3645f = "PersonalDataDuxo.kt", m3646l = {91, 96}, m3647m = "getRequestContent")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$getRequestContent$1 */
    static final class C282251 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C282251(Continuation<? super C282251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PersonalDataDuxo.this.getRequestContent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataViewState refresh$lambda$1$lambda$0(PersonalDataViewState personalDataViewState, PersonalDataViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return personalDataViewState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalDataDuxo(PimsStore pimsStore, StaticContentStore staticContentStore, Application app, Markwon.Builder markwonBuilder) {
        super(PersonalDataViewState.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(pimsStore, "pimsStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
        this.pimsStore = pimsStore;
        this.staticContentStore = staticContentStore;
        RhTypeface rhTypeface = RhTypeface.BOLD;
        Context applicationContext = app.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Markwon markwonBuild = markwonBuilder.usePlugin(new StrongerBoldMarkwonPlugin(rhTypeface.load(applicationContext))).build();
        Intrinsics.checkNotNullExpressionValue(markwonBuild, "build(...)");
        this.markwon = markwonBuild;
    }

    /* compiled from: PersonalDataDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataViewState;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$refresh$1", m3645f = "PersonalDataDuxo.kt", m3646l = {40, 48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$refresh$1 */
    static final class C282261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PersonalDataViewState>, Object> {
        final /* synthetic */ PersonalDataRequestType $requestType;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: PersonalDataDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$refresh$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiDataSubjectListItem.Status.values().length];
                try {
                    iArr[ApiDataSubjectListItem.Status.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiDataSubjectListItem.Status.COMPLETED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiDataSubjectListItem.Status.EXPIRED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282261(PersonalDataRequestType personalDataRequestType, Continuation<? super C282261> continuation) {
            super(2, continuation);
            this.$requestType = personalDataRequestType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonalDataDuxo.this.new C282261(this.$requestType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PersonalDataViewState> continuation) {
            return ((C282261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiDataSubjectListItem apiDataSubjectListItem;
            PersonalDataViewState.Success.Status status;
            PersonalDataViewState.Success.Status status2;
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PersonalDataDuxo personalDataDuxo = PersonalDataDuxo.this;
                PersonalDataRequestType personalDataRequestType = this.$requestType;
                this.label = 1;
                obj = personalDataDuxo.getMostRecentRequest(personalDataRequestType, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                PersonalDataViewState.Success.Status status3 = (PersonalDataViewState.Success.Status) this.L$1;
                apiDataSubjectListItem = (ApiDataSubjectListItem) this.L$0;
                ResultKt.throwOnFailure(obj);
                status2 = status3;
                list = (List) obj;
                if (list != null) {
                    return PersonalDataViewState.Error.INSTANCE;
                }
                return new PersonalDataViewState.Success(list, status2, apiDataSubjectListItem != null ? apiDataSubjectListItem.getCreated_at() : null, apiDataSubjectListItem != null ? apiDataSubjectListItem.getExpires_at() : null, apiDataSubjectListItem != null ? apiDataSubjectListItem.getUuid() : null);
            }
            ResultKt.throwOnFailure(obj);
            apiDataSubjectListItem = (ApiDataSubjectListItem) obj;
            ApiDataSubjectListItem.Status status4 = apiDataSubjectListItem != null ? apiDataSubjectListItem.getStatus() : null;
            int i2 = status4 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status4.ordinal()];
            if (i2 == -1) {
                status = PersonalDataViewState.Success.Status.NONE;
            } else if (i2 == 1) {
                status = PersonalDataViewState.Success.Status.PENDING;
            } else if (i2 == 2) {
                status = PersonalDataViewState.Success.Status.COMPLETED;
            } else if (i2 == 3) {
                status = PersonalDataViewState.Success.Status.EXPIRED;
            } else {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(status4);
                throw new ExceptionsH();
            }
            PersonalDataDuxo personalDataDuxo2 = PersonalDataDuxo.this;
            PersonalDataRequestType personalDataRequestType2 = this.$requestType;
            this.L$0 = apiDataSubjectListItem;
            this.L$1 = status;
            this.label = 2;
            Object requestContent = personalDataDuxo2.getRequestContent(personalDataRequestType2, this);
            if (requestContent != coroutine_suspended) {
                status2 = status;
                obj = requestContent;
                list = (List) obj;
                if (list != null) {
                }
            }
            return coroutine_suspended;
        }
    }

    public final void refresh(PersonalDataRequestType requestType) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C282261(requestType, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDuxo.refresh$lambda$1(this.f$0, (PersonalDataViewState) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDuxo.refresh$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$1(PersonalDataDuxo personalDataDuxo, final PersonalDataViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        personalDataDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDuxo.refresh$lambda$1$lambda$0(state, (PersonalDataViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refresh$lambda$3(PersonalDataDuxo personalDataDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        personalDataDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDuxo.refresh$lambda$3$lambda$2((PersonalDataViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataViewState refresh$lambda$3$lambda$2(PersonalDataViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PersonalDataViewState.Error.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMostRecentRequest(PersonalDataRequestType personalDataRequestType, Continuation<? super ApiDataSubjectListItem> continuation) {
        C282241 c282241;
        List list;
        if (continuation instanceof C282241) {
            c282241 = (C282241) continuation;
            int i = c282241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c282241.label = i - Integer.MIN_VALUE;
            } else {
                c282241 = new C282241(continuation);
            }
        }
        Object dataAccessRequestList = c282241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c282241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(dataAccessRequestList);
            int i3 = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
            if (i3 == 1) {
                PimsStore pimsStore = this.pimsStore;
                c282241.label = 1;
                dataAccessRequestList = pimsStore.getDataAccessRequestList(c282241);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                PimsStore pimsStore2 = this.pimsStore;
                c282241.label = 2;
                dataAccessRequestList = pimsStore2.getDataDeleteRequestList(c282241);
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            ResultKt.throwOnFailure(dataAccessRequestList);
            list = (List) dataAccessRequestList;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(dataAccessRequestList);
            list = (List) dataAccessRequestList;
        }
        return CollectionsKt.firstOrNull(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r1 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b9 -> B:36:0x00ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRequestContent(PersonalDataRequestType personalDataRequestType, Continuation<? super List<UiPersonalDataRequestDetailsItem>> continuation) {
        C282251 c282251;
        String str;
        Collection arrayList;
        Iterator it;
        C282251 c2822512;
        if (continuation instanceof C282251) {
            c282251 = (C282251) continuation;
            int i = c282251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c282251.label = i - Integer.MIN_VALUE;
            } else {
                c282251 = new C282251(continuation);
            }
        }
        C282251 c2822513 = c282251;
        Object objLoadEntry$default = c2822513.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c2822513.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objLoadEntry$default);
            int i3 = WhenMappings.$EnumSwitchMapping$0[personalDataRequestType.ordinal()];
            if (i3 == 1) {
                str = PERSONAL_DATA_ACCESS_REQUEST_CONTENTFUL_ID;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = PERSONAL_DATA_DELETE_REQUEST_CONTENTFUL_ID;
            }
            StaticContentStore staticContentStore = this.staticContentStore;
            c2822513.label = 1;
            objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, str, null, c2822513, 2, null);
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(objLoadEntry$default);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (Collection) c2822513.L$2;
            it = (Iterator) c2822513.L$1;
            Collection collection = (Collection) c2822513.L$0;
            ResultKt.throwOnFailure(objLoadEntry$default);
            c2822512 = c2822513;
            ApiExpandableContentSection apiExpandableContentSection = (ApiExpandableContentSection) ((EntryResource) objLoadEntry$default).getValue();
            arrayList.add(new UiPersonalDataRequestDetailsItem(apiExpandableContentSection.getHeader(), Markwons.toSpanned$default(this.markwon, new MarkdownContent("**" + apiExpandableContentSection.getHeader() + "**"), null, 2, null), Markwons.toSpanned$default(this.markwon, apiExpandableContentSection.getBody(), null, 2, null)));
            arrayList = collection;
            if (it.hasNext()) {
                ResourceLink resourceLink = (ResourceLink) it.next();
                StaticContentStore staticContentStore2 = this.staticContentStore;
                c2822512.L$0 = arrayList;
                c2822512.L$1 = it;
                c2822512.L$2 = arrayList;
                c2822512.label = 2;
                objLoadEntry$default = ContentRepository.DefaultImpls.load$default(staticContentStore2, resourceLink, null, c2822512, 2, null);
                if (objLoadEntry$default != coroutine_suspended) {
                    collection = arrayList;
                    ApiExpandableContentSection apiExpandableContentSection2 = (ApiExpandableContentSection) ((EntryResource) objLoadEntry$default).getValue();
                    arrayList.add(new UiPersonalDataRequestDetailsItem(apiExpandableContentSection2.getHeader(), Markwons.toSpanned$default(this.markwon, new MarkdownContent("**" + apiExpandableContentSection2.getHeader() + "**"), null, 2, null), Markwons.toSpanned$default(this.markwon, apiExpandableContentSection2.getBody(), null, 2, null)));
                    arrayList = collection;
                    if (it.hasNext()) {
                        return (List) arrayList;
                    }
                }
                return coroutine_suspended;
            }
        }
        List<ResourceLink<EntryResource<ApiExpandableContentSection>>> content = ((ApiExpandableContent) ((EntryResource) objLoadEntry$default).getValue()).getContent();
        if (content == null) {
            return null;
        }
        List<ResourceLink<EntryResource<ApiExpandableContentSection>>> list = content;
        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        it = list.iterator();
        c2822512 = c2822513;
        if (it.hasNext()) {
        }
    }
}
