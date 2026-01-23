package com.nimbusds.jose.shaded.ow2asm;

/* loaded from: classes27.dex */
final class Edge {
    final int info;
    Edge nextEdge;
    final Label successor;

    Edge(int i, Label label, Edge edge) {
        this.info = i;
        this.successor = label;
        this.nextEdge = edge;
    }
}
