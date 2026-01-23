package com.robinhood.utils.p409ui.context;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: BaseContexts.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002\u001a \u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0007\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0002\u001a\u001e\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0004*\u00020\u0002H\u0086\b¢\u0006\u0002\u0010\u0007¨\u0006\n"}, m3636d2 = {"baseContexts", "Lkotlin/sequences/Sequence;", "Landroid/content/Context;", "findActivityBaseContext", "Landroidx/appcompat/app/AppCompatActivity;", "findActivityTypeBaseContext", "T", "(Landroid/content/Context;)Landroidx/appcompat/app/AppCompatActivity;", "requireActivityBaseContext", "requireActivityTypeBaseContext", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.ui.context.BaseContextsKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class BaseContexts {
    public static final Sequence<Context> baseContexts(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: com.robinhood.utils.ui.context.BaseContextsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseContexts.baseContexts$lambda$0((Context) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context baseContexts$lambda$0(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
        if (contextWrapper != null) {
            return contextWrapper.getBaseContext();
        }
        return null;
    }

    public static final AppCompatActivity findActivityBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Sequence sequenceFilter = SequencesKt.filter(baseContexts(context), new Function1<Object, Boolean>() { // from class: com.robinhood.utils.ui.context.BaseContextsKt$findActivityBaseContext$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof AppCompatActivity);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (AppCompatActivity) SequencesKt.firstOrNull(sequenceFilter);
    }

    public static final /* synthetic */ <T extends AppCompatActivity> T findActivityTypeBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Sequence<Context> sequenceBaseContexts = baseContexts(context);
        Intrinsics.needClassReification();
        Sequence sequenceFilter = SequencesKt.filter(sequenceBaseContexts, new Function1<Object, Boolean>() { // from class: com.robinhood.utils.ui.context.BaseContextsKt$findActivityTypeBaseContext$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                Intrinsics.reifiedOperationMarker(3, "T");
                return Boolean.valueOf(Objects.nonNull(obj));
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return (T) SequencesKt.firstOrNull(sequenceFilter);
    }

    public static final /* synthetic */ <T extends AppCompatActivity> T requireActivityTypeBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Sequence<Context> sequenceBaseContexts = baseContexts(context);
        Intrinsics.needClassReification();
        Sequence sequenceFilter = SequencesKt.filter(sequenceBaseContexts, new Function1<Object, Boolean>() { // from class: com.robinhood.utils.ui.context.BaseContextsKt$requireActivityTypeBaseContext$$inlined$findActivityTypeBaseContext$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                Intrinsics.reifiedOperationMarker(3, "T");
                return Boolean.valueOf(Objects.nonNull(obj));
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        T t = (T) SequencesKt.firstOrNull(sequenceFilter);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("Context has no Activity: " + context).toString());
    }

    public static final AppCompatActivity requireActivityBaseContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AppCompatActivity appCompatActivityFindActivityBaseContext = findActivityBaseContext(context);
        if (appCompatActivityFindActivityBaseContext != null) {
            return appCompatActivityFindActivityBaseContext;
        }
        throw new IllegalStateException(("Context has no Activity: " + context).toString());
    }
}
