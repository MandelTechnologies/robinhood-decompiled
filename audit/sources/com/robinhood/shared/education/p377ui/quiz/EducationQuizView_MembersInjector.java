package com.robinhood.shared.education.p377ui.quiz;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationQuizView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationQuizView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "duxo", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EducationQuizView_MembersInjector implements MembersInjector<EducationQuizView> {
    private final Provider<EducationQuizDuxo> duxo;
    private final Provider<Markwon> markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<EducationQuizView> create(Provider<Markwon> provider, Provider<EducationQuizDuxo> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final void injectDuxo(EducationQuizView educationQuizView, EducationQuizDuxo educationQuizDuxo) {
        INSTANCE.injectDuxo(educationQuizView, educationQuizDuxo);
    }

    @JvmStatic
    public static final void injectMarkwon(EducationQuizView educationQuizView, Markwon markwon) {
        INSTANCE.injectMarkwon(educationQuizView, markwon);
    }

    public EducationQuizView_MembersInjector(Provider<Markwon> markwon, Provider<EducationQuizDuxo> duxo) {
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        this.markwon = markwon;
        this.duxo = duxo;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EducationQuizView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Markwon markwon = this.markwon.get();
        Intrinsics.checkNotNullExpressionValue(markwon, "get(...)");
        companion.injectMarkwon(instance, markwon);
        EducationQuizDuxo educationQuizDuxo = this.duxo.get();
        Intrinsics.checkNotNullExpressionValue(educationQuizDuxo, "get(...)");
        companion.injectDuxo(instance, educationQuizDuxo);
    }

    /* compiled from: EducationQuizView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/quiz/EducationQuizView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizView;", "markwon", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon;", "duxo", "Lcom/robinhood/shared/education/ui/quiz/EducationQuizDuxo;", "injectMarkwon", "", "instance", "injectDuxo", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<EducationQuizView> create(Provider<Markwon> markwon, Provider<EducationQuizDuxo> duxo) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            return new EducationQuizView_MembersInjector(markwon, duxo);
        }

        @JvmStatic
        public final void injectMarkwon(EducationQuizView instance, Markwon markwon) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            instance.setMarkwon(markwon);
        }

        @JvmStatic
        public final void injectDuxo(EducationQuizView instance, EducationQuizDuxo duxo) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(duxo, "duxo");
            instance.setDuxo(duxo);
        }
    }
}
