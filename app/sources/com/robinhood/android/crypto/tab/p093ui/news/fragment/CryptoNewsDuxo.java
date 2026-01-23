package com.robinhood.android.crypto.tab.p093ui.news.fragment;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EducationLessonsStore;
import com.robinhood.librobinhood.data.store.newsfeed.NewsFeedElementStore;
import com.robinhood.models.newsfeed.p334db.NewsFeedContent;
import com.robinhood.models.newsfeed.p334db.NewsFeedInstrument;
import com.robinhood.models.newsfeed.p334db.NewsFeedLocation;
import com.robinhood.models.newsfeed.p334db.dao.NewsFeedElement;
import com.robinhood.models.p320db.Quote;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNewsDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0014\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsDataState;", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsViewState;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsStateProvider;", "educationLessonsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;", "newsFeedElementStore", "Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/crypto/tab/ui/news/fragment/CryptoNewsStateProvider;Lcom/robinhood/librobinhood/data/store/bonfire/EducationLessonsStore;Lcom/robinhood/librobinhood/data/store/newsfeed/NewsFeedElementStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "markEducationLessonsAppeared", "lessons", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoNewsDuxo extends BaseDuxo<CryptoNewsDataState, CryptoNewsViewState> {
    public static final int $stable = 8;
    private final EducationLessonsStore educationLessonsStore;
    private final NewsFeedElementStore newsFeedElementStore;
    private final QuoteStore quoteStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CryptoNewsDuxo(CryptoNewsDuxo4 stateProvider, EducationLessonsStore educationLessonsStore, NewsFeedElementStore newsFeedElementStore, QuoteStore quoteStore, DuxoBundle duxoBundle) {
        super(new CryptoNewsDataState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(educationLessonsStore, "educationLessonsStore");
        Intrinsics.checkNotNullParameter(newsFeedElementStore, "newsFeedElementStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.educationLessonsStore = educationLessonsStore;
        this.newsFeedElementStore = newsFeedElementStore;
        this.quoteStore = quoteStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<List<NewsFeedElement>> observableStreamNewsFeedElementsByFeedType = this.newsFeedElementStore.streamNewsFeedElementsByFeedType(NewsFeedLocation.CRYPTO);
        LifecycleHost.DefaultImpls.bind$default(this, observableStreamNewsFeedElementsByFeedType, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoNewsDuxo.onStart$lambda$0(this.f$0, (List) obj);
            }
        });
        Observable<R> observableSwitchMap = observableStreamNewsFeedElementsByFeedType.switchMap(new Function() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsDuxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Iterable<Quote>> apply(List<NewsFeedElement> newsFeedElements) {
                Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = newsFeedElements.iterator();
                while (it.hasNext()) {
                    CollectionsKt.addAll(arrayList, ((NewsFeedElement) it.next()).getContents());
                }
                ArrayList arrayList2 = new ArrayList();
                for (T t : arrayList) {
                    if (t instanceof NewsFeedContent.Article) {
                        arrayList2.add(t);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    CollectionsKt.addAll(arrayList3, ((NewsFeedContent.Article) it2.next()).getRelatedInstruments());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList3.size());
                Iterator<T> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(((NewsFeedInstrument) it3.next()).getInstrumentId());
                }
                Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
                Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
                return CryptoNewsDuxo.this.quoteStore.pollQuotesByInstrumentIds(setUnmodifiableSet);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.tab.ui.news.fragment.CryptoNewsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoNewsDuxo.onStart$lambda$1(this.f$0, (Iterable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CryptoNewsDuxo cryptoNewsDuxo, List newsFeedElements) {
        Intrinsics.checkNotNullParameter(newsFeedElements, "newsFeedElements");
        cryptoNewsDuxo.applyMutation(new CryptoNewsDuxo2(newsFeedElements, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoNewsDuxo cryptoNewsDuxo, Iterable iterable) {
        cryptoNewsDuxo.applyMutation(new CryptoNewsDuxo3(iterable, null));
        return Unit.INSTANCE;
    }

    public final void markEducationLessonsAppeared(List<EducationLessonPreview> lessons) {
        Intrinsics.checkNotNullParameter(lessons, "lessons");
        this.educationLessonsStore.setLessonsAppearanceTimestamps(lessons);
    }
}
