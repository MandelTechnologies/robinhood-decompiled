package com.squareup.workflow1.p415ui;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: ViewRegistry.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bJ1\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\"\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m3636d2 = {"Lcom/squareup/workflow1/ui/ViewRegistry;", "", "RenderingT", "Lkotlin/reflect/KClass;", "renderingType", "Lcom/squareup/workflow1/ui/ViewFactory;", "getFactoryFor", "(Lkotlin/reflect/KClass;)Lcom/squareup/workflow1/ui/ViewFactory;", "Companion", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ViewRegistry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    <RenderingT> ViewFactory<RenderingT> getFactoryFor(KClass<? extends RenderingT> renderingType);

    /* compiled from: ViewRegistry.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/squareup/workflow1/ui/ViewRegistry$Companion;", "Lcom/squareup/workflow1/ui/ViewEnvironmentKey;", "Lcom/squareup/workflow1/ui/ViewRegistry;", "()V", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "getDefault", "()Lcom/squareup/workflow1/ui/ViewRegistry;", "wf1-core-android"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion extends ViewEnvironmentKey<ViewRegistry> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
            super(Reflection.getOrCreateKotlinClass(ViewRegistry.class));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.workflow1.p415ui.ViewEnvironmentKey
        public ViewRegistry getDefault() {
            return ViewRegistry2.ViewRegistry();
        }
    }
}
