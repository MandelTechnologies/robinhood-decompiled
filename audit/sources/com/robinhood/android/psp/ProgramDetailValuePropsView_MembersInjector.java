package com.robinhood.android.psp;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.MembersInjector;
import io.noties.markwon.Markwon;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProgramDetailValuePropsView_MembersInjector.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailValuePropsView_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/android/psp/ProgramDetailValuePropsView;", "markwonBuilder", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon$Builder;", "<init>", "(Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ProgramDetailValuePropsView_MembersInjector implements MembersInjector<ProgramDetailValuePropsView> {
    private final Provider<Markwon.Builder> markwonBuilder;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<ProgramDetailValuePropsView> create(Provider<Markwon.Builder> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final void injectMarkwonBuilder(ProgramDetailValuePropsView programDetailValuePropsView, Markwon.Builder builder) {
        INSTANCE.injectMarkwonBuilder(programDetailValuePropsView, builder);
    }

    public ProgramDetailValuePropsView_MembersInjector(Provider<Markwon.Builder> markwonBuilder) {
        Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
        this.markwonBuilder = markwonBuilder;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ProgramDetailValuePropsView instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Companion companion = INSTANCE;
        Markwon.Builder builder = this.markwonBuilder.get();
        Intrinsics.checkNotNullExpressionValue(builder, "get(...)");
        companion.injectMarkwonBuilder(instance, builder);
    }

    /* compiled from: ProgramDetailValuePropsView_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\tH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/psp/ProgramDetailValuePropsView_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/android/psp/ProgramDetailValuePropsView;", "markwonBuilder", "Ljavax/inject/Provider;", "Lio/noties/markwon/Markwon$Builder;", "injectMarkwonBuilder", "", "instance", "feature-partner-stock-program_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<ProgramDetailValuePropsView> create(Provider<Markwon.Builder> markwonBuilder) {
            Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
            return new ProgramDetailValuePropsView_MembersInjector(markwonBuilder);
        }

        @JvmStatic
        public final void injectMarkwonBuilder(ProgramDetailValuePropsView instance, Markwon.Builder markwonBuilder) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(markwonBuilder, "markwonBuilder");
            instance.setMarkwonBuilder(markwonBuilder);
        }
    }
}
