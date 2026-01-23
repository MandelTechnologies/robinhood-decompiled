package com.robinhood.utils.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.VerticalAlignmentLine;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: TargetedScroll.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000eR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/compose/TargetedScrollColumnScope;", "T", "Landroidx/compose/foundation/layout/ColumnScope;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "getScrollState", "()Landroidx/compose/foundation/ScrollState;", "registerAsScrollTarget", "Landroidx/compose/ui/Modifier;", "key", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;", "centerOn", "", "target", "(Ljava/lang/Object;)V", "scrollTo", "lib-utils-compose_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TargetedScrollColumnScope<T> extends Column5 {
    @Override // androidx.compose.foundation.layout.Column5
    /* synthetic */ Modifier align(Modifier modifier, Alignment.Horizontal horizontal);

    @Override // androidx.compose.foundation.layout.Column5
    /* synthetic */ Modifier alignBy(Modifier modifier, VerticalAlignmentLine verticalAlignmentLine);

    @Override // androidx.compose.foundation.layout.Column5
    /* synthetic */ Modifier alignBy(Modifier modifier, Function1 function1);

    void centerOn(T target);

    ScrollState getScrollState();

    Modifier registerAsScrollTarget(Modifier modifier, T t);

    void scrollTo(T target);

    @Override // androidx.compose.foundation.layout.Column5
    /* synthetic */ Modifier weight(Modifier modifier, float f, boolean z);
}
